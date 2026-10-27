/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
public abstract class Docente extends persona implements Pagable {

    public Docente(String nombre, String documento) {
        super(nombre, documento);
    }

    @Override
    public String presentarse() {
        return "Hola, soy " + getNombre() + " Docente que gana: " + calcularPago();
    }
    
}