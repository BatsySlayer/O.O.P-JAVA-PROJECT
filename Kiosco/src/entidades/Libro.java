/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Santiago Fernández - Juan Pablo Sánchez - Daniel Niño
 */
public class Libro {
    
    //Atributos
    private String isbn;
    private int unidadesDisponibles;
    private double precio;
    private String nombre;
    //Relaciones
    private ArrayList <Libro> obsequios = new ArrayList <Libro> ();
    
    //Constructores

    public Libro() {
    }

    public Libro(String isbn, int unidadesDisponibles, double precio, String nombre) {
        this.isbn = isbn;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    //Getters-Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getObsequios() {
        return obsequios;
    }

    public void setObsequios(ArrayList<Libro> obsequios) {
        this.obsequios = obsequios;
    }
    
    //Métodos
}
