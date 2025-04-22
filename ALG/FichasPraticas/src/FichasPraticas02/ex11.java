package FichasPraticas02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, result;

        // Ler nr1
        System.out.print("- Introduza saldo medio:  ");
        nr1 = input.nextInt();

        // Ler nr2
        System.out.print("- Introduza o valor a movimentar:  ");
        nr2 = input.nextInt();

        // Calc. Soma
        result = nr1 + nr2;

        // Apresentacao
        if (result >= 0){
            System.out.println("- Saldo Atual:  " + result);
        }
        else{
            System.out.println("- Operacao Invalida. Saldo Insuficiente");
            System.out.println("- Saldo Atual:  " + nr1);
        }
    }
}
