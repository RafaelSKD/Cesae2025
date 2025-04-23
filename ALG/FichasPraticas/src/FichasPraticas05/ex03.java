package FichasPraticas05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int i = 0, maior, next;
        int[] vetor = new int[10];

        while (i < 10){
            System.out.print("> Insira um número no Array[" + i +"]: ");
            vetor[i] = input.nextInt();
            i++;
        }
        i = 0;
        next = vetor[i];
        maior = vetor[i];
        while (i <= 9){
            if (i < 9){
                next = vetor[i++];
            }
            if (next > maior)
                maior = next;
            i++;
        }
        System.out.print("> O maior elemento do array e: " + maior);
    }
}
