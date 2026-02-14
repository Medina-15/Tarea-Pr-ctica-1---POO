/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aliso
 */
public class Prestamo {
    private String fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(String fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    // Método que ejecuta la lógica del préstamo
    public void prestarLibro() {
        if (libro.isDisponible()) {
            libro.setDisponible(false); // Cambia estado del libro
            usuario.recibirLibro(libro); // Agrega a la lista del usuario
            System.out.println("Préstamo exitoso: " + libro.getTitulo() + " a " + usuario.getNombre() + " (" + fecha + ")");
        } else {
            System.out.println("Error: El libro " + libro.getTitulo() + " no está disponible.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro() {
        libro.setDisponible(true);
        usuario.entregarLibro(libro);
        System.out.println("Devolución registrada: " + libro.getTitulo());
    }
}
