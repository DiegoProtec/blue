package org.contecin;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.FileNotFoundException;
import java.io.InputStream;

@Path("/blue")
public class GreetingResource {

    @GET
    @Produces({MediaType.TEXT_HTML})
    public InputStream hello() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        return classloader.getResourceAsStream("blue.html");
    }
}
