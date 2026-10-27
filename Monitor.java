/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
public class Monitor extends Estudiante implements Pagable {
    private int horas;

    public Monitor(String nombre, String documento, double promedio, int horas) {
        super(nombre, documento, promedio);
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
        double valorHora = 15000.0; 
        return horas * valorHora;
    }
}
