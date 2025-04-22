package FichasPraticas01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1;
        double pi = 3.14;
        double result;
        // Ler nr1
        System.out.print("- Introduz raio do circulo em cm:  ");
        nr1 = input.nextInt();

        // Calc. area circulo + Apresentar
        result = (pi) * (nr1 * nr1);
        System.out.println("- A area do Circulo e: " + result + "cm2");
    }
}
