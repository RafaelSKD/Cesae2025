package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]vetor = new int[14];

        for (int i = 0; i < 14; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 13; i >= 0; i--){
            System.out.println("- " + vetor[i]);
        }
    }
}
