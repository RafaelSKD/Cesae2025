package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("- Insira um número no Array[" + i + "]: ");
            array[i] = input.nextInt();
        }

        int i = 0, temp;

        while (i < 9){
            if (array[i] > array[i + 1]){
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            }
            else
                i++;
        }

        for (i = 0; i < 10; i++)
            System.out.println("- Array[" + i + "] = " + array[i]);

    }
}
