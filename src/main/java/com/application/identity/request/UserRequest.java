package com.application.identity.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

    @JsonProperty
    private String email;

    @JsonProperty
    private String password;

    public String getEmailId() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
