/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author aliso
 */
public class Libro {
    // Encapsulamiento estricto
    private String title;
    private String autor;
    private String isbn;
    private boolean disponible;

    // Constructor
    public Libro(String title, String autor, String isbn) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto está disponible
    }

    // Métodos getters y setters necesarios
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "'" + title + "' de " + autor;
    }
}