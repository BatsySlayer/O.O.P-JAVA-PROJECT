/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Santiago Fernández - Juan Pablo Sánchez - Daniel Niño
 */
public class Prestamo {
    
    //Atributos
    private LocalDate fechaHora;
    //Relaciones
    private ArrayList <Libro> librosEnPrestamo = new ArrayList <Libro> ();
    private ArrayList <Billete> pagoBilletes = new ArrayList <Billete> ();
    
    //Constructores

    public Prestamo() {
    }

    public Prestamo(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    //Getters-Setters

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ArrayList<Libro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }

    public void setLibrosEnPrestamo(ArrayList<Libro> librosEnPrestamo) {
        this.librosEnPrestamo = librosEnPrestamo;
    }

    public ArrayList<Billete> getPagoBilletes() {
        return pagoBilletes;
    }

    public void setPagoBilletes(ArrayList<Billete> pagoBilletes) {
        this.pagoBilletes = pagoBilletes;
    }
    
    //Métodos
}
