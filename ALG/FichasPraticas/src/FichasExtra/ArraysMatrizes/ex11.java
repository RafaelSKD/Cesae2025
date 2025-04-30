package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = 15;
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("- Insira um número no Array[" + i + "]: ");
            array[i] = input.nextInt();
        }

        int i = 0, par, impar;

        par = countPar(array);
        impar = tamanho - par;

        int[] arrayPar = new int[par];
        int[] arrayImpar = new int[impar];

        int parIndex = 0, imparIndex = 0;
        for (int z = 0; z < array.length; z++){
            if (isPar(array[z])){
                arrayPar[parIndex] = array[z];
                parIndex++;
            }
            else{
                arrayImpar[imparIndex] = array[z];
                imparIndex++;
            }
        }
        for (i = 0; i < arrayPar.length; i++)
            System.out.println("- Array:    Par[" + i + "] = " + arrayPar[i]);
        for (i = 0; i < arrayImpar.length; i++)
            System.out.println("- Array:  Impar[" + i + "] = " + arrayImpar[i]);


    }

    static boolean isPar(int    num){
        if (num == 0)
            return true;
        if (num % 2 == 0)
            return true;
        return false;
    }

    static int countPar(int[ ] array){
        int i = 0, par = 0;
        while (i < array.length){
            if (isPar(array[i]))
                par++;
            i++;
        }
        return par;
    }
}
