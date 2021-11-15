package com.application.identity.interfaces;

import com.application.identity.model.UserDetail;
import com.application.identity.request.UserAccessRequest;
import com.application.identity.request.UserRatingRequest;
import com.application.identity.request.UserRequest;

public interface UserDetailInterface {
    String createUserDetail(UserRequest userRequest);
    UserDetail getUserById(Integer id);
    UserDetail createUserAccess(UserAccessRequest userAccessRequest);
    String createUser(UserRequest userRequest);
    UserDetail updatePassword(UserRequest userRequest);
    UserDetail addUserRating(UserRatingRequest userRatingRequest);
}
