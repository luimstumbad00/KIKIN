package com.example.listaareas;

public class ClaseCu {
    double lado1, lado2;

    public ClaseCu(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Metodos para sacar cada area

    public double areacuadrado(){
        return lado1 * lado1;
    }

    public double areatriangulo(){
        return (lado1 * lado2) * 0.5;
    }

    public double arearectangulo(){
        return lado1 * lado2;
    }

    public double areacirculo(){
        return lado1 * 3.14;
    }
}
