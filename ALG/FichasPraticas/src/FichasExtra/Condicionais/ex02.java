package FichasExtra.Condicionais;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kg;

        System.out.print("- Introduza o peso (em Kg.):  ");
        kg = input.nextDouble();

        if (kg > 0){
            kg = kg * 0.16;
            System.out.println("- Peso na lua: " + kg + " Kg.");
        }
        else
            System.out.println("- Atencao! Peso nao valido\nNao estamos a pesar baloes de helio!");
    }
}
