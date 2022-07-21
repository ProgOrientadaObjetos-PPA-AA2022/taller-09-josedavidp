/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author josed
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public Persona(String next, String next2) {
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String u) {
        username = u;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    @Override
    public String toString(){
        String cadena = String.format("\n\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUsername: %s", 
                nombre, 
                apellido, 
                username);
        return cadena;
    }
}
