package com.practica1.rest.controller.dao.services;
import com.practica1.rest.controller.dao.ExpresionDao;
import com.practica1.rest.controller.tda.list.LinkedList;
import com.practica1.rest.models.Expresion;

public class ExpresionServices {
    private ExpresionDao obj;

    public ExpresionServices() {
        obj = new ExpresionDao();
    }
    
    public Boolean save() throws Exception {
        return obj.save();
    }

    public Boolean update() throws Exception {
        return obj.update();
    }

    public LinkedList listAll() {
        return obj.getListAll();
    }

    public Expresion getExpresion() {
        return obj.getExpresion();
    }

    public void setExpresion(Expresion expresion) {
        obj.setExpresion(expresion);
    }

    public Expresion get(Integer id) throws Exception {
        return obj.get(id);
    }

}

