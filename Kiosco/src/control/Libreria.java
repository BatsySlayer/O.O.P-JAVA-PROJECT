/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Billete;
import entidades.Libro;
import entidades.Prestamo;
import java.util.ArrayList;

/**
 *
 * @author Santiago Fernández - Juan Pablo Sánchez - Daniel Niño
 */
public class Libreria {
    
    //Relaciones
    private GestionLibro gestion = new GestionLibro();
    private ArrayList <Libro> librosDisponibles = new ArrayList <Libro> ();
    private ArrayList <Prestamo> prestamos = new ArrayList <Prestamo> ();
    private Prestamo prestamoActual;
    private ArrayList <Billete> dineroAcumulado = new ArrayList <Billete> ();
    
    //Constructores

    public Libreria() {
        
    }   
    
    //Getters-Setters

    public GestionLibro getGestion() {
        return gestion;
    }

    public void setGestion(GestionLibro gestion) {
        this.gestion = gestion;
    }

    public ArrayList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(ArrayList<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Prestamo getPrestamoActual() {
        return prestamoActual;
    }

    public void setPrestamoActual(Prestamo prestamoActual) {
        this.prestamoActual = prestamoActual;
    }

    public ArrayList<Billete> getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(ArrayList<Billete> dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }
    
    //Métodos
}
