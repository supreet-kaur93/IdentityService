package com.application.identity.helper;

import com.application.identity.dao.UserDetailDao;
import com.application.identity.interfaces.UserDetailInterface;
import com.application.identity.service.UserDetailServiceImpl;
import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {

    private UserDetailDao userDetailDao;

    public BasicModule(UserDetailDao userDetailDao) {
        this.userDetailDao = userDetailDao;
    }

    @Override
    protected void configure() {
        bind(UserDetailInterface.class).to(UserDetailServiceImpl.class);
        bind(UserDetailDao.class).toInstance(userDetailDao);
    }
}
