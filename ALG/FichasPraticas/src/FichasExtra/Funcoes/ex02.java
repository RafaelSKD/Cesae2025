package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, media;
        System.out.print("Introduza um numero: ");
        num1 = input.nextDouble();
        System.out.print("Introduza um numero: ");
        num2 = input.nextDouble();
        System.out.print("Introduza um numero: ");
        num3 = input.nextDouble();

        media = media(num1, num2, num3);
        System.out.print("Media: " + media);
    }

    public static double media(double num1, double num2, double num3){
        double media;

        media = (num1 + num2 + num3) / 3;
        return media;
    }
}
