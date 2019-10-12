/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoseguimientooctubre32019;

import java.util.Scanner;

/**
 *
 * @author VBADev1
 */
public class NuevoSeguimientoOctubre32019 {

    public static void main(String[] args) {
        AlturaDeUnTriangulo Altura = new AlturaDeUnTriangulo();
        Altura.CalcularAltura();

        Aleatorios Aleatorio = new Aleatorios();
        Aleatorio.generarAleatorioDeSeisCifras();

        Horosopo HoroscopoDeHoy = new Horosopo();
        HoroscopoDeHoy.GenerarHoroscopo();

        Scanner miScanner = new Scanner(System.in);
        //Capturando el numero uno
        System.out.print("Ingrese La palabra que desea utilizar: ");
        String PalabraParaOperar = miScanner.next();
        Palabra palabra = new Palabra(PalabraParaOperar);
        palabra.ConvertirAUperCase();
        palabra.ConvertirALowerCase();
    }

}
