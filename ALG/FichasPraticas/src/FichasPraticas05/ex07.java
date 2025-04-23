package FichasPraticas05;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int i = 0, maiorpar = 0;
        int[] vetor = new int[10];

        while (i < 10){
            System.out.print("> Insira um número no Array[" + i +"]: ");
            vetor[i] = input.nextInt();
            i++;
        }
        i = 0;
        while (i <= 9){
            if (i < 9){
                if (vetor[i] < vetor[i+1]){
                    if (vetor[i+1] % 2 == 0)
                        maiorpar = vetor[i+1];
                }
            }
            i++;
        }
        if (maiorpar == 0){
            System.out.print("> Nao existe maior par!");
            return;
        }
        System.out.print("> O maior numero par e: " + maiorpar);
    }
}
