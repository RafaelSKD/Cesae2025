package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("- Quantos elementos quer no Array:");
        num = input.nextInt();

        int[]vetor = new int[num];
        System.out.println();
        for (int i = 0; i < num; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < num; i++)
            System.out.println("- " + vetor[i]);
    }
}
