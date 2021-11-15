package com.application.identity;

import com.application.identity.configuration.IdentityServiceConfiguration;
import com.application.identity.dao.UserDetailDao;
import com.application.identity.helper.BasicModule;
import com.application.identity.resource.IdentityResource;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class IdentityService extends Application<IdentityServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new IdentityService().run(args);
    }

    @Override
    public void run(IdentityServiceConfiguration configuration, Environment environment) throws Exception {

        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");
        final UserDetailDao userDetailDao = jdbi.onDemand(UserDetailDao.class);
        Injector injector = Guice.createInjector(new BasicModule(userDetailDao));
        IdentityResource identityResource = injector.getInstance(IdentityResource.class);
        environment.jersey().register(identityResource);
    }

    public void initialize(final Bootstrap<IdentityServiceConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<IdentityServiceConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(IdentityServiceConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
    }
}
