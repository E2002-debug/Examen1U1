package com.practica1.rest.controller.dao;
import java.util.function.ToIntBiFunction;
import com.practica1.rest.controller.dao.implement.AdapterDao;
import com.practica1.rest.controller.tda.list.LinkedList;
import com.practica1.rest.models.Expresion;

public class ExpresionDao extends AdapterDao<Expresion> {
    
    private Expresion expresion;
    private LinkedList listAll;
    public ExpresionDao() {
        super(Expresion.class);
    }
    public Expresion getExpresion() {
        if (expresion == null) {
            expresion = new Expresion();
        }
        return this.expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }
    
    public LinkedList getListAll() {
        if(listAll == null){
            this.listAll = listAll();
        }
        return listAll;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize()+1;
        expresion.setId(id);
        this.persist(this.expresion);
        return true;
    }

    public Boolean update() throws Exception {
        this.merge(getExpresion(), getExpresion().getId());
        return true;
    }



}


