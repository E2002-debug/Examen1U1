package com.practica1.rest;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.practica1.rest.controller.dao.ExpresionDao;

@Path("myresource")
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {
        HashMap<String, Object> mapa = new HashMap<>();
        ExpresionDao in  = new ExpresionDao();
        String aux = "";

        try {

            in.getExpresion().setExpresion1("2+2");
            in.getExpresion().setExpresion2("4");
            in.save();

            aux = "La lista está vacía: " + in.listAll().isEmpty();
        } catch (Exception e) {
            System.out.println("Errores: " + e.getCause());
            mapa.put("msg", "Error");
            mapa.put("data", e.toString());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(mapa).build();
        }

    

        mapa.put("msg", "Ok");
        mapa.put("data", "test " + aux);
        
        return Response.ok(mapa).build();
    }
}
