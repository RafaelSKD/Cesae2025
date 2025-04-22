package FichasPraticas01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, result;

        // Ler nr1
        System.out.print("- Introduza a altura em m:  ");
        nr1 = input.nextInt();

        // Ler nr2
        System.out.print("- Introduza o comprimento em m:  ");
        nr2 = input.nextInt();

        // Calc. area + Apresentar
        result = nr1 * nr2;
        System.out.println("- A area do retangulo e: " + result + "m2");

        // Calc. Perimetro + Apresentar
        result = (nr1 * 2) + (nr2 * 2);
        System.out.println("- O Perimetro do retangulo e: " + result + "m");
    }
}
