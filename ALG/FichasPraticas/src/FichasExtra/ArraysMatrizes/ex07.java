package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("- Quantos elementos quer no Array: ");
        num = input.nextInt();

        int[] vetor = new int[num];
        int last = num;

        for (int i = 0; i < num; i++) {
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < last; i++)
            System.out.println("- Array[" + i + "] = " + vetor[i]);

        System.out.print("\n- Que elemento quer remover: ");
        int del = input.nextInt();

        int i = 0;
        while (i < last) {
            if (vetor[i] == del) {
                for (int j = i; j < last - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                last--;
            } else {
                i++;
            }
        }
        for (i = 0; i < last; i++)
            System.out.println("- Array[" + i + "] = " + vetor[i]);
    }
}
