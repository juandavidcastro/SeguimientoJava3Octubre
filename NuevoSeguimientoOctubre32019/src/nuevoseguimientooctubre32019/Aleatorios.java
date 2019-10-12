/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoseguimientooctubre32019;

import java.math.BigInteger;

/**
 *
 * @author VBADev1
 */
public class Aleatorios {
    public void generarAleatorioDeSeisCifras(){
        double aleatorio;
        aleatorio=Math.round(Math.random()*1000000);
        int aleatorioEntero=(int)aleatorio;
        System.out.println("El número aleatorio de seis cifras generado es: "+aleatorioEntero);
    }
}
