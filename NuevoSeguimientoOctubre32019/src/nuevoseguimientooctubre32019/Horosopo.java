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
public class Horosopo {

    public void GenerarHoroscopo() {
        double aleatorio;
        aleatorio = Math.round(Math.random() * 10);
        int AleatorioEntero = (int) aleatorio;
        switch (AleatorioEntero) {
            case 1:
                System.out.print("Horoscopo: Hoy conseguirás novia o novio");
                break;
            case 2:
                System.out.print("Horoscopo: Hoy te van a ofrecer un nuevo empleo");
                break;
            case 3:
                System.out.print("Horoscopo: Tendrás la oportunidad de viajar al exterior");
                break;
            case 4:
                System.out.print("Horoscopo: Tendrás nuevos proyectos en tu vida amorosa");
                break;
            case 5:
                System.out.print("Horoscopo: Te encontrarás con tus amigos de tu infancia");
                break;
            case 6:
                System.out.print("Horoscopo: Tendrás un gran logro en tu carrera");
                break;
            case 7:
                System.out.print("Horoscopo: Vas a tener un hijo");
                break;
            case 8:
                System.out.print("Horoscopo: Es un buen día para hacer ejercicio");
                break;
            case 9:
                System.out.print("Horoscopo: Ganarás un ascenso en tu trabajo");
                break;
            case 10:
                System.out.print("Horoscopo: Tendrás nuevas oportunidades de educación");
                break;

        }

    }

}
