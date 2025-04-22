package FichasPraticas02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double salario;
        long impostos;

        // Ler nr1
        System.out.print("- Introduza um salario:  ");
        salario = input.nextDouble();

        // Logica
        if (salario <= 15000){
        salario = salario * 0.2;
        impostos = Math.round(salario);
        System.out.print("- O valor total de impostos a taxa paga de 20%:  " + impostos);
        }
        else if (salario > 15000 && salario <= 20000){
            salario = salario * 0.3;
            impostos = Math.round(salario);
            System.out.print("- O valor total de impostos a taxa paga de 30%:  " + impostos);
        }
        else if(salario > 20000 && salario <= 25000){
            salario = salario * 0.35;
            impostos = Math.round(salario);
            System.out.print("- O valor total de impostos a taxa paga de 35%:  " + impostos);
        }
        else {
            salario = salario * 0.40;
            impostos = Math.round(salario);
            System.out.print("- O valor total de impostos a taxa paga de 40%:  " + impostos);
        }
    }
}
