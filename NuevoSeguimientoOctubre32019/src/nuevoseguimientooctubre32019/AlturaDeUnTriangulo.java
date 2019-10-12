/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoseguimientooctubre32019;

/**
 *
 * @author VBADev1
 */
public class AlturaDeUnTriangulo {
    
    public void CalcularAltura(){    
    double LadoAdyacente=20;
    double angulo=35;
    double anguloEnRadianes = Math.toRadians(angulo);
    double Altura;
    Altura=LadoAdyacente*Math.tan(anguloEnRadianes);
    System.out.print("La altura del triangulo es: "+Altura);
    }
}
