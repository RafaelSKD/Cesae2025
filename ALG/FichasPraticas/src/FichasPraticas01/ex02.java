package FichasPraticas01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, result;

        // Ler nr1
        System.out.print("- Introduza um numero:  ");
        nr1 = input.nextInt();

        // Ler nr2
        System.out.print("- Introduza um numero:  ");
        nr2 = input.nextInt();

        // Calc. Soma + Apresentar
        result = nr1 + nr2;
        System.out.println("- Soma: " + result);

        // Calc. Subt + Apresentar
        result = nr1 - nr2;
        System.out.println("- Subtracao: " + result);

        // Calc. Multipl + Apresentar
        result = nr1 * nr2;
        System.out.println("- Multiplicacao: " + result);

        // Calc. Div + Apresentar
        result = nr1 / nr2;
        System.out.println("- Divisao: " + result);
    }
}
