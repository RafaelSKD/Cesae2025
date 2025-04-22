package FichasPraticas02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int horas, min;

        // Ler horas
        System.out.print("- Introduza horas:  ");
        horas = input.nextInt();

        // Ler minutos
        System.out.print("- Introduza minutos:  ");
        min = input.nextInt();

        // Conversao
        if (horas < 12)
            System.out.println("- " + horas + ":" + min + " AM");
        else{
            horas = horas - 12;
            System.out.println("- " + horas + ":" + min + " PM");
        }
    }
}
