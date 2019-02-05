package com.bonamis.springjersey;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/bonjour")
public class Endpoint {


    @GET
    public String message() {
        return "Hello " + "message";
    }

}