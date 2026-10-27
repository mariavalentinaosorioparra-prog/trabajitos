/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
public class DocenteCatedra extends Docente {
    private int horas;

    public DocenteCatedra(String nombre, String documento, int horas) {
        super(nombre, documento);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularPago() {
        double valorHoraCatedra = 35000.0;
        return horas * valorHoraCatedra;
    }
}
