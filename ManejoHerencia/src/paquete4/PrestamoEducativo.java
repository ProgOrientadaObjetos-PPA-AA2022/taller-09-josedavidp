/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete6.InstituciónEducativa;
import paquete7.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstituciónEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPrestamo;

    public PrestamoEducativo(Persona b, int t, String c, String ne, InstituciónEducativa ce, double vc) {
        super(b, t, c);
        nivelEstudio = ne;
        centroEducativo = ce;
        valorCarrera = vc;
    }

    public void establecerNivelEstudio(String ne) {
        nivelEstudio = ne;
    }

    public void establecerCentroEducativo(InstituciónEducativa ce) {
        centroEducativo = ce;
    }

    public void establecerValorCarrera(double vc) {
        valorCarrera = vc;
    }

    public void calcularValorMensualPrestamo() {
        double aux;
        aux = (valorCarrera / tiempoPrestamo);
        valorMensualPrestamo = (10 * aux) / 100;
        valorMensualPrestamo = aux - valorMensualPrestamo;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstituciónEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensualPrestamo() {
        return valorMensualPrestamo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());

        cadena = String.format(
                "%s\nCENTRO EDUCATIVO %s\n"
                + "\tNivel de estudio: %s\n"
                + "\tValor carrera: %.2f\n"
                + "\tValor mensual: %.2f\n",
                cadena,
                centroEducativo,
                nivelEstudio,
                valorCarrera,
                valorMensualPrestamo);
        return cadena;
    }
}
