/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete7.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoPrestamo = t;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamo(int t) {
        tiempoPrestamo = t;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("BENEFICIARIO %s\n"
                + "\tTiempo de prestamo: %d\n"
                + "\tCiudad: %s", 
                beneficiario,
                tiempoPrestamo, 
                ciudad);
        return cadena;
    }
}
