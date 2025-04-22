package FichasPraticas02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double salario;
        long salarioFinal;

        // Ler nr1
        System.out.print("- Introduza um salario:  ");
        salario = input.nextDouble();

        // Operacoes + Apresentracao
        if (salario <= 15000){
            salario = salario * 0.8;
            salarioFinal = Math.round(salario);
            System.out.println("- Paga taxa de 20%: " + salarioFinal + "€");
        }
        else{
            salario = salario * 0.7;
            salarioFinal = Math.round(salario);
            System.out.println("- Paga taxa de 30%: " + salarioFinal + "€");
        }
    }
}
