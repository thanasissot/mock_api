package ath.sotiroglou.cillium.tracing;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class Resource {

    @GET
    public Response sayHello() {
        return Response.ok("Hello from Quarkus!").build();
    }

}
