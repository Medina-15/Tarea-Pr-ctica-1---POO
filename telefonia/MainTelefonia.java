/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefonia;

/**
 *
 * @author aliso
 */
public class MainTelefonia {
    public static void main(String[] args) {
        Plan planBasico = new Plan("Plan Conectado", 100, 5, 20.00);
        Cliente cliente = new Cliente("Maria Gomez", "555-1234", planBasico);
        
        // Se paso de minutos (120 vs 100) y de datos (6 vs 5)
        Factura facturaAgosto = new Factura(cliente, 120, 6);
        facturaAgosto.generarFactura();
    }
}