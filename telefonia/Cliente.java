/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefonia;

/**
 *
 * @author aliso
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private Plan plan; 

    public Cliente(String nombre, String telefono, Plan plan) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.plan = plan;
    }

    public String getNombre() { return nombre; }
    public Plan getPlan() { return plan; }
}

