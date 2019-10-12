/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoseguimientooctubre32019;

import java.util.*;

/**
 *
 * @author VBADev1
 */
public class Palabra {

    String PalabraParaOperar;

    public Palabra(String PalabraParaOperar) {
        this.PalabraParaOperar = PalabraParaOperar;
    }


    public void ConvertirAUperCase() {
        String PalabraEnUpperCase;
        PalabraEnUpperCase=this.PalabraParaOperar.toUpperCase();
        System.out.print("La palabra en UpperCase es: "+PalabraEnUpperCase);
       
    }
    
        public void ConvertirALowerCase() {
        String PalabraEnLowerCase;
        PalabraEnLowerCase=this.PalabraParaOperar.toLowerCase();
        System.out.print("La palabra en LowerCase es: "+PalabraEnLowerCase);
       
        
    }

}
