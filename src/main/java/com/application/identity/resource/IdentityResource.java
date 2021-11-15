package com.application.identity.resource;

import com.application.identity.interfaces.UserDetailInterface;
import com.application.identity.model.UserDetail;
import com.application.identity.request.UserAccessRequest;
import com.application.identity.request.UserRatingRequest;
import com.application.identity.request.UserRequest;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import io.dropwizard.hibernate.UnitOfWork;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/identity")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class IdentityResource {

    private UserDetailInterface userDetailService;

    @Inject
    public IdentityResource(UserDetailInterface userDetailInterface) {
        this.userDetailService = userDetailInterface;
    }

    @POST
    //@Timed
    @Path("/api/v1/create_user_access")
    public String createUserAccess(UserAccessRequest userAccessRequest) {

    }

    @POST
    @Timed
    @Path("/api/v1/create_user")
    //@UnitOfWork
    public String createUser(@Valid UserRequest userRequest) {
        return userDetailService.createUser(userRequest);
    }

    @POST
    @Timed
    @Path("/api/v1/update_password")
    public String updatePassword(UserRequest userRequest) {
        return "";
    }

    @GET
    @Timed
    @Path("/api/v1/get_user_sorted_by_rating")
    public String getUserSortedByRating() {
        return "";
    }

    @GET
    @Timed
    @Path("/api/v1/get_user_by_id")
    @UnitOfWork
    public UserDetail getUserById(@QueryParam("id") Integer id) {
        return userDetailService.getUserById(id);
    }

    @POST
    @Timed
    @Path("/api/v1/add_user_rating")
    @UnitOfWork
    public String addUserRating(UserRatingRequest userRatingRequest) {
        return "";
    }
}
