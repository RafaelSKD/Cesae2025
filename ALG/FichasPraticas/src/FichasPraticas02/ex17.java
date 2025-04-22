package FichasPraticas02;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double saldo, credito;
        long creditof;

        // Ler saldo
        System.out.print("- Introduza saldo medio:  ");
        saldo = input.nextDouble();
         // Logica
        if (saldo <= 2000)
            System.out.print("- Credito nao aprovado!");
        else if (saldo <= 4000){
            credito = saldo * 0.2;
            creditof = Math.round(credito);
            System.out.print("- Credito aprovado em: " + creditof + " €");
        }
        else if (saldo <= 6000){
            credito = saldo * 0.3;
            creditof = Math.round(credito);
            System.out.print("- Credito aprovado em: " + creditof + " €");
        }
        else{
            credito = saldo * 0.4;
            creditof = Math.round(credito);
            System.out.print("- Credito aprovado em: " + creditof + " €");
        }
    }
}

