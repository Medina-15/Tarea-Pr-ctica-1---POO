/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aliso
 */
import java.util.ArrayList; // Usamos ArrayList para la colección dinámica

public class Usuario {
    private String nombre;
    private String id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    // Método para agregar libro a la colección del usuario
    public void recibirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    // Método para devolver (sacar) libro de la colección
    public void entregarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public void listarLibros() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println("Libros en posesión de " + nombre + ":");
            for (Libro l : librosPrestados) {
                System.out.println("- " + l.toString());
            }
        }
    }
}
