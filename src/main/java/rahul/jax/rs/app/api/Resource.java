/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahul.jax.rs.app.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import rahul.jax.rs.app.security.Roles;
import rahul.jax.rs.app.security.Secured;

/**
 * @author rahul.kh
 */
@Path("resources")
public class Resource {

    @GET
    public Response get() {
        return Response.ok("This is an unsecured resource").build();
    }

    @GET
    @Path("normal")
    @Secured({Roles.NORMAL})
    public Response securedNormal() {
        return Response.ok("This is a secured resource for normal user").build();
    }

    @GET
    @Path("admin")
    @Secured({Roles.ADMIN})
    public Response securedAdmin() {
        return Response.ok("This is a secured resource for admin user").build();
    }
}
