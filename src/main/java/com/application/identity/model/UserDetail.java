package com.application.identity.model;

import com.application.identity.request.UserRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetail {

    public UserDetail(int id, String email, String password, String rating) {
        this.id = id;
        this.email_id = email;
        this.password = password;
        this.rating = rating;
    }

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String email_id;

    @JsonProperty
    private String password;

    @JsonProperty
    private String rating;

    public UserDetail(UserRequest userRequest) {
        this.email_id = userRequest.getEmailId();
        this.password = userRequest.getPassword();
    }

    public UserDetail() {}

    public Integer getId() {
        return id;
    }

    public String getRating() {
        return rating;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return email_id;
    }
 
}
