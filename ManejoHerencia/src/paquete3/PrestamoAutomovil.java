/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete7.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPago;

    public PrestamoAutomovil(Persona b, int t, String c, String ta, String ma, Persona g1, double va) {
        super(b, t, c);
        tipoAutomovil = ta;
        marcaAutomovil = ma;
        garante1 = g1;
        valorAutomovil = va;
    }

    public PrestamoAutomovil(Persona b, int t, String c) {
        super(b, t, c);
    }

    public void establecerCiudad(String c) {
        ciudad = c.toLowerCase();
    }

    public void establecerTipoAutomovil(String ta) {
        tipoAutomovil = ta;
    }

    public void establecerMarcaAutomovil(String ma) {
        marcaAutomovil = ma;
    }

    public void establecerGarante1(Persona g1) {
        garante1 = g1;
    }

    public void establecerValorAutomovil(double va) {
        valorAutomovil = va;
    }

    public void calcularValorMensualPago() {
        valorMensualPago = valorAutomovil / obtenerTiempoPrestamo();
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualPago() {
        return valorMensualPago;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nDATOS DEL GARANTE %s\n"
                + "DATOS DEL AUTOMOVIL\n"
                + "\tTipo de Automovil: %s\n"
                + "\tMarca de Automovil %s\n"
                + "\tValor Automovil: %.2f\n"
                + "\tValor Mensual de Pago: %.2f\n\n",
                super.toString(),
                garante1,
                tipoAutomovil,
                marcaAutomovil,
                valorAutomovil,
                valorMensualPago);
        return cadena;
    }
}
