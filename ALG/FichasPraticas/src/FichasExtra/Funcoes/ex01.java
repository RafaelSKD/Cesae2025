package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, menor;
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num3 = input.nextInt();

        menor = numeroMaisPequeno(num1, num2, num3);
        System.out.print("Menor: " + menor);
    }

    public static int numeroMaisPequeno(int num1, int num2, int num3){
        int smallestNumber;

        if (num1 < num2){
            if (num1 < num3)
                return num1;
        }
        if (num2 < num1){
            if (num2 < num3)
                return num2;
        }
        return num3;
    }
}
