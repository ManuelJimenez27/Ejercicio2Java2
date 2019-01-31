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
        String dia = "";
        String hora= "";
        System.out.println("Introduzca el dia: ");
        dia = sc.nextLine();
        switch(dia){
            case "Lunes":
                diasemana=0;
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
                String part1 = parts[0]; 
                String part2 = parts[1]; 
                int minutosr= Integer.parseInt(part2);
                int minutos = 0;
                int ihora = Integer.parseInt(part1); 
                int minTotales = (4 * 24 * 60) + (15 * 60);       
                int minActuales = (diasemana * 24 * 60) + (ihora * 60) + minutosr;
                String minAct = Integer.toString(minActuales);
                int minres;
                minres= minTotales - minActuales;
                System.out.print("Faltan " + minres + " minutos para el fin de semana.");
                
        }
    }
  

