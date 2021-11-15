package com.application.identity.request;

import com.application.identity.enums.Role;
import com.application.identity.enums.UserAccess;

import java.util.List;

public class UserAccessRequest {
    private String name;
    private Role role;
    private List<UserAccess> userAccessList;
    private String emailId;
}

