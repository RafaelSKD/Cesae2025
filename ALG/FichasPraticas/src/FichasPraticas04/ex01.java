package FichasPraticas04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, num2, total;
        String operacao, opcao;

        while (true) {
            System.out.print("- Introduza um numero:  ");
            num1 = input.nextInt();
            input.nextLine();

            System.out.print("- Introduza um operador (+ - * /): ");
            operacao = input.nextLine();

            System.out.print("- Introduza outro numero:  ");
            num2 = input.nextInt();
            input.nextLine();

            switch (operacao) {
                case "+":
                    total = num1 + num2;
                    System.out.println("- Total: " + total);
                    break;
                case "-":
                    total = num1 - num2;
                    System.out.println("- Total: " + total);
                    break;
                case "*":
                    total = num1 * num2;
                    System.out.println("- Total: " + total);
                    break;
                case "/":
                    if (num2 != 0) {
                        total = num1 / num2;
                        System.out.println("- Total: " + total);
                    } else {
                        System.out.println("- Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("- Operador inválido.");
            }

            System.out.println("- Deseja continuar? (S/N): ");
            opcao = input.nextLine();

            if (opcao.equalsIgnoreCase("N")) {
                break;
            }
        }

        input.close();
    }
}
