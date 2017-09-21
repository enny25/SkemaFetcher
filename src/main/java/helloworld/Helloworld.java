/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("skema")
public class Helloworld {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Helloworld
     */
    public Helloworld() {
    }

    /**
     * Retrieves representation of an instance of helloworld.Helloworld
     * @return an instance of java.lang.String
     */
    
    @GET
    @Path("{user}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("user") String user) {
        String jsonString = "";
        if (user.equalsIgnoreCase("asger")){
            jsonString = "return schedule: {\n" +
"            student: {\n" +
"                name: \"Asger\",\n" +
"                studentId: \"100\"\n" +
"            },\n" +
"            courses: [\n" +
"                {\n" +
"                    name: \"course1\",\n" +
"                    date: \"20-09-2017\",\n" +
"                    startTime: \"08:30\",\n" +
"                    endTime: \"12:00\",\n" +
"                    local: \"101\",\n" +
"                    teacher: \"LAM\"\n" +
"                },\n" +
"                {\n" +
"                    name: \"course2\",\n" +
"                    date: \"20-09-2017\",\n" +
"                    startTime: \"12:30\",\n" +
"                    endTime: \"16:00\",\n" +
"                    local: \"101\",\n" +
"                    teacher: \"BORG\"\n" +
"                } ]}";
            
        }
        else{
            jsonString = "return schedule: {\n" +
"            student: {\n" +
"                name: \"Jens\",\n" +
"                studentId: \"100\"\n" +
"            },\n" +
"            courses: [\n" +
"                {\n" +
"                    name: \"course7\",\n" +
"                    date: \"19-09-2017\",\n" +
"                    startTime: \"12:30\",\n" +
"                    endTime: \"16:00\",\n" +
"                    local: \"105\",\n" +
"                    teacher: \"LAM\"\n" +
"                },\n" +
"                {\n" +
"                    name: \"course5\",\n" +
"                    date: \"20-09-2017\",\n" +
"                    startTime: \"08:30\",\n" +
"                    endTime: \"12:00\",\n" +
"                    local: \"201\",\n" +
"                    teacher: \"BORG\"\n" +
"                } ]}";
        }
         return jsonString;
    }

    /**
     * PUT method for updating or creating an instance of Helloworld
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
