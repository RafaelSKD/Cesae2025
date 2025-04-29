package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]vetor = new int[10];
        int target, j = 0, find = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.print("- Insira um número a pesquisar: ");
        target = input.nextInt();
        while (j < 10){
            if (vetor[j] == target){
                System.out.println("- O número " + target + " existe no Array[" + j + "]");
                find = 1;
            }
            j++;
        }
        if (find == 0)
            System.out.println("- O número " + target + " não existe no Array");
    }
}
