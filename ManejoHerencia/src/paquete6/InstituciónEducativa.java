/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

/**
 *
 * @author josed
 */
public class InstituciónEducativa {
    protected String nombre;
    protected String siglas;

    public InstituciónEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\tNombre Institución: %s\n"
                + "\tSiglas: %s", 
                nombre, 
                siglas);
        return cadena;
    }
}
