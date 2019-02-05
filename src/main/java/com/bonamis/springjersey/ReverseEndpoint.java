package com.bonamis.springjersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/auRevoir")
public class ReverseEndpoint {


    @GET
    public String message() {
        return "Au revoir";
    }

}