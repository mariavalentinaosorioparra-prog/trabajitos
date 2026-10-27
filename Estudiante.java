/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
public class Estudiante extends persona {
    private double promedio;

    public Estudiante(String nombre, String documento, double promedio) {
        super(nombre, documento);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String presentarse() {
        return super.presentarse() + " con promedio: " + promedio;
    }
}
