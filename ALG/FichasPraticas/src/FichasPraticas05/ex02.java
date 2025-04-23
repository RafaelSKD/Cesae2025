package FichasPraticas05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int i = 0, total = 0;
        int[] vetor = new int[12];

        while (i < 12){
            if (i < 9){
                System.out.print("> Insira a comissao mensal de 0" + (i+1) +"/2025: ");
                vetor[i] = input.nextInt();
            }
            else {
                System.out.print("> Insira a comissao mensal de " + (i+1) +"/2025: ");
                vetor[i] = input.nextInt();
            }
            i++;
        }
        i = 0;
        while (i < 12){
            total += vetor[i];
            i++;
        }
        System.out.print("> A comissao total de 2025 e de: " + total + "$");
    }
}