/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2java2;
import java.util.Scanner;
//import java.lang.Integer;
/**
 *
 * @author manuel
 */
public class Ejercicio2Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int diasemana = 0;
        String dia=null;
        String hora=null;
        switch(dia){
            case "Lunes":
                diasemana=1;
                break;
            case "Martes":
                diasemana=1;
                break;
            case "Miércoles":
                diasemana=2;
                break;
            case "Jueves":
                diasemana=3;
                break;
            case "Viernes":
                diasemana=4;
                break;
            default: 
                System.out.println("El dia introducido no es correcto");
        }
                System.out.println("Introduzca la hora");
                hora=sc.nextLine();
                String string = hora;
                String[] parts = string.split(":");
                String part1 = parts[0]; // 123
                String part2 = parts[1]; // 654321
                int minutosr= Integer.parseInt(part2);
                int minutos = 0;
                int ihora = Integer.parseInt(hora); 
                int minutosTotales = (4 * 24 * 60) + (15 * 60);       
                int minutosActuales = (diasemana * 24 * 60) + (ihora * 60) + minutosr;
                String minAct = Integer.toString(minutosActuales);
                System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
                //int iminutos = Integer.parseInt(minutos);
        }
    }
  

