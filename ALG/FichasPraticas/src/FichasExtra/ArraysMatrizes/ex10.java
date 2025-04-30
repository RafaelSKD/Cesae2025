package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = 12;
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("- Insira um número no Array[" + i + "]: ");
            array[i] = input.nextInt();
        }

        int contador = 0, i = 0, k = 1;
        while (i < tamanho - 1){
            while (k < tamanho){
                if (array[i] == array[k]){
                    contador++;
                    break;
                }
                k++;
            }
            i++;
            k = i + 1;
        }

        int[] array2 = new int[tamanho - contador];
        i = 0;
        k = 0;
        while (i < tamanho){
            if (!isInArray(array[i], array2, k)){
                array2[k] = array[i];
                i++;
                k++;
            }
            else
                i++;
        }

        for (i = 0; i < array2.length; i++)
            System.out.println("- Array2[" + i + "] = " + array2[i]);

    }

        static boolean isInArray(int    num, int[ ] array2, int k){
            int i = 0;

            while (i < k){
                if (num == array2[i])
                    return true;
                i++;
            }
            return false;
        }
}
