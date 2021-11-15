package com.application.identity.service;

import com.application.identity.dao.UserDetailDao;
import com.application.identity.interfaces.UserDetailInterface;
import com.application.identity.model.UserDetail;
import com.application.identity.request.UserAccessRequest;
import com.application.identity.request.UserRatingRequest;
import com.application.identity.request.UserRequest;
import com.google.inject.Inject;

public class UserDetailServiceImpl implements UserDetailInterface {

    private UserDetailDao userDetailDao;

    @Inject
    public UserDetailServiceImpl(UserDetailDao userDetailDao) {
        this.userDetailDao = userDetailDao;
    }

    @Override
    public String createUserDetail(UserRequest userRequest) {
        UserDetail userDetail = new UserDetail(userRequest);
        return "SUCCESS";
    }

    @Override
    public UserDetail getUserById(Integer id) {
        return null;
    }

    @Override
    public UserDetail createUserAccess(UserAccessRequest userAccessRequest) {
        return null;
    }

    @Override
    public String createUser(UserRequest userRequest) {
        UserDetail userDetail = new UserDetail(userRequest);
        userDetailDao.insert(userDetail);
        return "SUCCESSFULLY CREATED USER - " + userDetail;
    }

    @Override
    public UserDetail updatePassword(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserDetail addUserRating(UserRatingRequest userRatingRequest) {
        return null;
    }
}
