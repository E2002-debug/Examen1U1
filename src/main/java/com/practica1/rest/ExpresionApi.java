package com.practica1.rest;

import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import com.practica1.rest.controller.dao.services.ExpresionServices;

@Path("expresion")
public class ExpresionApi {

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllFamilys() {
        HashMap<String, Object> map = new HashMap<>();
        ExpresionServices ps = new ExpresionServices();
        map.put("msg", "Ok");
        map.put("data", ps.listAll().toArray());
        if (ps.listAll().isEmpty()) {
            map.put("data", new Object[] {});
        }
        return Response.ok(map).build();
    }

    @Path("/save")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(HashMap<String, Object> map) {
        ExpresionServices ps = new ExpresionServices();
        ps.getExpresion().setExpresion1(map.get("expresion1").toString());
        ps.getExpresion().setExpresion2(map.get("expresion2").toString());  
        

        HashMap<String, Object> res = new HashMap<>();
        try {
            ps.save();
            res.put("msg", "OK");
            res.put("data", "Expresion registrado correctamente");
            return Response.ok(res).build();
        } catch (Exception e) {
            res.put("msg", "Error");
            res.put("data", e.toString());
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(res).build();
        }
    }

    
   
}
