package com.example.listacalculadora;

public class Clasesita {
    public Clasesita(Double dato1, Double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    Double dato1;
    Double dato2;

    public Double getDato1() {
        return dato1;
    }

    public void setDato1(Double dato1) {
        this.dato1 = dato1;
    }

    public Double getDato2() {
        return dato2;
    }

    public void setDato2(Double dato2) {
        this.dato2 = dato2;
    }

    public Double sumita(){
        return dato1 + dato2;
    }

    public Double restita(){
        return dato1 - dato2;
    }

    public Double multi(){
        return dato1 * dato2;
    }

    public Double div(){
        return dato1 / dato2;
    }
}
