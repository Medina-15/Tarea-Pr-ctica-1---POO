/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiculo;

/**
 *
 * @author aliso
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    // --- 1. Constructor vacio ---
    public Vehiculo() {
        this.placa = "SIN-PLACA";
        this.marca = "Generica";
        this.modelo = "Basico";
    }

    // --- 2. Constructor intermedio ---
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = "Modelo Base";
    }

    // --- 3. Constructor completo ---
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // --- Metodos Sobrecargados ---

    public double calcularMantenimiento(int kilometros) {
        return kilometros * 0.05;
    }

    public double calcularMantenimiento(int kilometros, String tipoServicio) {
        double costoBase = kilometros * 0.05;
        double costoExtra = 0;

        if (tipoServicio.equals("Aceite")) {
            costoExtra = 50;
        } else if (tipoServicio.equals("Frenos")) {
            costoExtra = 120;
        }
        return costoBase + costoExtra;
    }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + marca + " " + modelo + " [" + placa + "]");
    }
}
