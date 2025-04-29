package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]vetor = new int[12];
        int j = 0, k;
        for (int i = 0; i < 12; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println();
        while (j < 12){
            k = j + 1;
            while (k < 12){
                if (vetor[j] == vetor [k]){
                    System.out.println("- Array[" + j + "] = Array[" + k + "]  = " + vetor[j]);
                }
                k++;
            }
            j++;
        }

    }
}
