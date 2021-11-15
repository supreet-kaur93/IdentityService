package com.application.identity;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Date;

@Path("/identity")
public class HealthCheck {

    @GET
    @Path("/healthcheck")
    public String healthCheck() {
        return "Ping Received at " + new Date();
    }
}
