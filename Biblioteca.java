/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author aliso
 */
public class Biblioteca {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabo", "12345");
        Libro libro2 = new Libro("El Principito", "Saint-Exupéry", "67890");

        // Crear usuario
        Usuario user1 = new Usuario("Carlos Pérez", "U001");

        // Verificar disponibilidad
        System.out.println("¿Está disponible 'Cien Años'? " + libro1.isDisponible());

        // Realizar préstamo
        Prestamo prestamo1 = new Prestamo("15/10/2023", user1, libro1);
        prestamo1.prestarLibro();

        // Intentar prestar el mismo libro de nuevo (debe fallar)
        Prestamo prestamoFallido = new Prestamo("16/10/2023", new Usuario("Ana", "U002"), libro1);
        prestamoFallido.prestarLibro();

        // Listar libros del usuario
        user1.listarLibros();

        // Devolver libro
        prestamo1.devolverLibro();
        System.out.println("¿Está disponible 'Cien Años' tras devolver? " + libro1.isDisponible());
    }
}