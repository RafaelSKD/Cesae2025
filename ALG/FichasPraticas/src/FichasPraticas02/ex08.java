package FichasPraticas02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double nr1, nr2, nr3;
        double result;
        // Ler nr1
        System.out.print("- Introduz uma nota:  ");
        nr1 = input.nextInt();
        // Ler nr2
        System.out.print("- Introduz outra nota:  ");
        nr2 = input.nextInt();
        // Ler nr3
        System.out.print("- Introduz outra nota:  ");
        nr3 = input.nextInt();
        // Calc. media + Apresenta
        result = (nr1 * 0.25) + (nr2 * 0.35) + (nr3 * 0.4);
        if (result >= 9.5){
            System.out.print("- Aprovado com nota final de: " + result);
        }
        else{
            System.out.print("- Reprovado com nota final de: " + result);
        }
    }
}
