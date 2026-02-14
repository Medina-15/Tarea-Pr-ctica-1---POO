/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefonia;

/**
 *
 * @author aliso
 */
public class Plan {
    private String nombrePlan;
    private int minutosIncluidos;
    private int datosIncluidosGB;
    private double precioMensual;

    public Plan(String nombrePlan, int minutos, int datos, double precio) {
        this.nombrePlan = nombrePlan;
        this.minutosIncluidos = minutos;
        this.datosIncluidosGB = datos;
        this.precioMensual = precio;
    }

    public double getPrecioMensual() { return precioMensual; }
    public int getMinutosIncluidos() { return minutosIncluidos; }
    public int getDatosIncluidosGB() { return datosIncluidosGB; }
    public String getNombrePlan() { return nombrePlan; }
}

