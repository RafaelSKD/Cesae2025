package FichasPraticas05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int i = 0, menor, next;
        int[] vetor = new int[10];

        while (i < 10){
            System.out.print("> Insira um número no Array[" + i +"]: ");
            vetor[i] = input.nextInt();
            i++;
        }
        i = 0;
        next = vetor[i];
        menor = vetor[i];
        while (i <= 9){
            if (i < 9){
                next = vetor[i++];
            }
            if (next < menor)
                menor = next;
            i++;
        }
        System.out.print("> O menor elemento do array e: " + menor);
    }
}
