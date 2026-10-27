/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
public class DocentePlanta extends Docente {
    private double salario;

    public DocentePlanta(String nombre, String documento, double salario) {
        super(nombre, documento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPago() {
        return salario;
    }
}
