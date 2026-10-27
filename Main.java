/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploclase5;

/**
 *
 * @author estuam
 */
import java.util.ArrayList; 

public class Main {
   
 public static void main(String[] args) {
    ArrayList<persona> comunidad = new ArrayList<>();
    comunidad.add(new Estudiante("Ana", "101", 4.5));
    comunidad.add(new DocentePlanta("Carlos", "202", 6000000));
    comunidad.add(new DocenteCatedra("Lucía", "303", 40, 80000));
    comunidad.add(new Monitor("Luis", "104", 4.2, 20));
 
    for (persona p : comunidad) {
        System.out.println(p.presentarse());
    }
 
    double nomina = 0;
    for (persona p : comunidad) {
        if (p instanceof Pagable pagable) {
            nomina += pagable.calcularPago();
        }
    }
    System.out.println("Nómina: " + nomina);
    System.out.println(comunidad.get(3));
}
  
}