package FichasPraticas02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, result;
        char operacao;

        //Recolha de dados
        System.out.print("- Indroduza um numero: ");
        nr1 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr2 = input.nextInt();
        System.out.print("- Qual a operacao a realizar\n      digite -> ( + - / * % ): ");
        operacao = input.next().charAt(0);

        // Verificar qual o menor e apresentar
        if (operacao == '*') {
            result = nr1 / nr2;
            System.out.print("- A multiplicacao de " + nr1 + " com " + nr2 + " = " + result);
        } else if (operacao == '/') {
            result = nr1 / nr2;
            System.out.print("- A divisao de " + nr1 + " com " + nr2 + " = " + result);
        } else if (operacao == '+') {
            result = nr1 + nr2;
            System.out.print("- A soma de " + nr1 + " com " + nr2 + " = " + result);
        } else if (operacao == '-') {
            result = nr1 - nr2;
            System.out.print("- A subtracao de " + nr1 + " com " + nr2 + " = " + result);
        } else if (operacao == '%') {
            result = nr1 % nr2;
            System.out.print("- O resto da divisao de " + nr1 + " com " + nr2 + " = " + result);
        } else {
                System.out.print("Erro de digitacao!");
        }
    }
}
