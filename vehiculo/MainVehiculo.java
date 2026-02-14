/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author aliso
 */



public class MainVehiculo {
    
    public static void main(String[] args) {
        // Ahora sí, usamos tu clase Vehiculo
        
        // 1. Crear instancias (Objetos)
        Vehiculo v1 = new Vehiculo(); // Constructor vacio
        Vehiculo v2 = new Vehiculo("ABC-123", "Toyota"); // Constructor intermedio
        Vehiculo v3 = new Vehiculo("XYZ-999", "Ford", "Mustang"); // Constructor completo

        // 2. Mostrar informacion
        System.out.println("--- INFORMACION ---");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        // 3. Probar calculos
        System.out.println("\n--- MANTENIMIENTOS ---");
        
        // Prueba metodo 1 (Solo kilometros)
        double costo1 = v3.calcularMantenimiento(10000);
        System.out.println("Costo v3 (Solo Km): " + costo1);
        
        // Prueba metodo 2 (Kilometros + Tipo Servicio)
        double costo2 = v3.calcularMantenimiento(10000, "Aceite");
        System.out.println("Costo v3 (Km + Aceite): " + costo2);
    }
}