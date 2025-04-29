package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, del, y, x = 0, last = 0;

        System.out.print("- Quantos elementos quer no Array:");
        num = input.nextInt();

        int[]vetor = new int[num];
        System.out.println();
        for (int i = 0; i < num; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
            last = i;
        }
        System.out.println();
        for (int i = 0; i < num; i++)
            System.out.println("- Array[" + i + "]= " + vetor[i]);

        System.out.print("- Que elemento quer remover:");
        del = input.nextInt();

        while (x < last){
            y = x + 1;
            while (x < last){
                if (vetor[x] == vetor[y]){
                    last--;
                    while (y < last){
                        vetor[y] = vetor[y + 1];
                        y++;
                    }
                }
            }
            x++;
        }
    }
}
