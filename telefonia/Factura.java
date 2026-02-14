/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefonia;

/**
 *
 * @author aliso
 */
public class Factura {
    private Cliente cliente;
    private int minutosConsumidos;
    private int datosConsumidosGB;

    public Factura(Cliente cliente, int minutosConsumidos, int datosConsumidosGB) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidosGB = datosConsumidosGB;
    }

    public void generarFactura() {
        Plan plan = cliente.getPlan();
        
        double total = plan.getPrecioMensual();
        double cargoMinutos = 0;
        double cargoDatos = 0;

        if (minutosConsumidos > plan.getMinutosIncluidos()) {
            int extra = minutosConsumidos - plan.getMinutosIncluidos();
            cargoMinutos = extra * 0.50;
        }

        if (datosConsumidosGB > plan.getDatosIncluidosGB()) {
            int extra = datosConsumidosGB - plan.getDatosIncluidosGB();
            cargoDatos = extra * 5.00;
        }

        total = total + cargoMinutos + cargoDatos;

        System.out.println("========== FACTURA ==========");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Plan: " + plan.getNombrePlan());
        System.out.println("Precio Base: " + plan.getPrecioMensual());
        System.out.println("Cargo Extra Minutos: " + cargoMinutos);
        System.out.println("Cargo Extra Datos: " + cargoDatos);
        System.out.println("TOTAL A PAGAR: " + total);
        System.out.println("=============================");
    }
}
