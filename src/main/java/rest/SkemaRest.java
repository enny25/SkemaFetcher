package rest;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import selenium.Selenium;

@Path("skema")
public class SkemaRest {
    Gson gson = new Gson();
    @Context
    private UriInfo context;

    public SkemaRest() {
    }
    
    @GET
    @Path("{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("user") String user) {
        Selenium selenium = new Selenium();
        return gson.toJson(selenium.callSelenium().getCourses());
    }
}
