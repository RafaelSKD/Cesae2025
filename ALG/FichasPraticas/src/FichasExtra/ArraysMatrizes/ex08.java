package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numElemArray1, numElemArray2, novoValor, indice;

        System.out.print("- Quantos elementos quer no Array: ");
        numElemArray1 = input.nextInt();
        numElemArray2 = numElemArray1 + 1;

        int[] array1 = new int[numElemArray1];
        int[] array2 = new int[numElemArray2];

        for (int i = 0; i < numElemArray1; i++) {
            System.out.print("- Insira um número no Array[" + i + "]: ");
            array1[i] = input.nextInt();
        }

        System.out.print("\n- Novo Valor: ");
        novoValor = input.nextInt();
        System.out.print("\n- Indice do Novo Valor: ");
        indice = input.nextInt();

        int i = 0, j = 0;
        while (i < numElemArray2){
            while (i < indice){
                array2[i] = array1[j];
                i++;
                j++;
            }
            if (i == indice){
                array2[i] = novoValor;
                i++;
            }
            else{
                array2[i] = array1[j];
                i++;
                j++;
            }
        }
        for (i = 0; i < numElemArray2; i++)
            System.out.println("- Array[" + i + "] = " + array2[i]);
    }
}
