package com.practica1.rest.models;

public class Expresion {

    private Integer id;
    private String expresion1;
    private String expresion2;

    public Expresion() {
    }

    public Expresion(Integer id, String expresion1, String expresion2) {
        this.id = id;
        this.expresion1 = expresion1;
            this.expresion2 = expresion2;
        }

    public Integer getId() {
      return this.id;
    }
    public void setId(Integer value) {
      this.id = value;
    }

    public String getExpresion1() {
      return this.expresion1;
    }
    public void setExpresion1(String value) {
      this.expresion1 = value;
    }

    public String getExpresion2() {
      return this.expresion2;
    }
    public void setExpresion2(String value) {
      this.expresion2 = value;
    }
    
    @Override
    public String toString() {
        return "Inversionista{" +
                "id=" + id +
                ", expresion1='" + expresion1 + '\'' +
                ", expresion2='" + expresion2 + 
                '}';
    }
}
