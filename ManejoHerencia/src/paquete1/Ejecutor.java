/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete6.InstitucionEducativa;
import paquete7.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String cadena = "";
        int opcion = 0;
        do {
            System.out.println("Ingrese el tipo de prestamo\n"
                    + "-[1] Automovil\n"
                    + "-[2] Educativo");
            int tipoPrestamo = sc.nextInt();
            sc.nextLine();

            switch (tipoPrestamo) {
                case 1:
                    System.out.println("Ingrese el nombre del beneficiario");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del beneficiario");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese el username del beneficiario");
                    String username = sc.nextLine();
                    System.out.println("Ingrese el tiempo de prestamo en meses");
                    int tiempoPrestamo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Ingrese el tipo de automovil");
                    String tipoAutomovil = sc.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    String marca = sc.nextLine();
                    System.out.println("Ingrese el nombre del garante");
                    String nombre1 = sc.nextLine();
                    System.out.println("Ingrese el apellido del garante");
                    String apellido1 = sc.nextLine();
                    System.out.println("Ingrese el username del garante");
                    String username1 = sc.nextLine();
                    System.out.println("Ingrese el valor del automovil");
                    double valor = sc.nextDouble();

                    Persona beneficiario = new Persona(nombre, apellido, username);
                    Persona garante = new Persona(nombre1, apellido1, username1);

                    PrestamoAutomovil prestamoA = new PrestamoAutomovil(beneficiario,
                            tiempoPrestamo, ciudad, tipoAutomovil, marca, garante, valor);
                    prestamoA.calcularValorMensualPago();

                    cadena = String.format("%s%s\n", cadena, prestamoA);
                    System.out.println("Desea continuar?\n"
                            + "-[1] Continuar\n"
                            + "-[0] Salir");
                    opcion = sc.nextInt();
                    break;

                case 2: {
                    System.out.println("Ingrese el nombre del beneficiario");
                    String nombre2 = sc.nextLine();
                    System.out.println("Ingrese el apellido del beneficiario");
                    String apellido2 = sc.nextLine();
                    System.out.println("Ingrese el username del beneficiario");
                    String username2 = sc.nextLine();
                    Persona beneficiario2 = new Persona(nombre2, apellido2, username2);
                    System.out.println("Ingrese el tiempo de prestamo en meses");
                    int tiempoPrestamo2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la ciudad");
                    String ciudad2 = sc.nextLine();
                    System.out.println("Ingrese el nivel de estudio");
                    String nivelEstudio = sc.nextLine();
                    System.out.println("Ingrese el nombre de la institucion");
                    String nombreInstitucion = sc.nextLine();
                    System.out.println("Ingrese las siglas de la institucion");
                    String siglasInstitucion = sc.nextLine();
                    InstitucionEducativa institucion = new InstitucionEducativa(nombreInstitucion, siglasInstitucion);
                    System.out.println("Ingrese el valor de la carrera");
                    double valorCarrera = sc.nextDouble();

                    PrestamoEducativo prestamoE = new PrestamoEducativo(beneficiario2, tiempoPrestamo2, ciudad2, nivelEstudio, institucion, valorCarrera);
                    prestamoE.calcularValorMensualPrestamo();

                    cadena = String.format("%s%s\n", cadena, prestamoE);
                    System.out.println("Desea continuar?\n"
                            + "-[1] Continuar\n"
                            + "-[0] Salir");
                    opcion = sc.nextInt();
                }

            }
        } while (opcion != 0);
        System.out.println(cadena);
    }
}
