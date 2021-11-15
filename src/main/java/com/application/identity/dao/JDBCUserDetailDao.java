package com.application.identity.dao;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class JDBCUserDetailDao {

    @Inject
    public JDBCUserDetailDao(
            @Named("connectionString") String connectionString)
    {
        System.out.println("ConnectionString = " + connectionString);
    }
}
