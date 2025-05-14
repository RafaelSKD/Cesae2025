package Header;

import java.util.Scanner;
import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;


public class array {
    public static int countPar(int[ ] array){
        int i = 0, par = 0;
        while (i < array.length){
            if (num.isPar(array[i]))
                par++;
            i++;
        }
        return par;
    }

    public static void fillArray(int[] array){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.print("- Insira um número no Array[" + i + "]: ");
            array[i] = input.nextInt();
        }
    }

    public static void fillMatriz(int[][] matriz){
        Scanner input = new Scanner(System.in);

        int y = 0, x = 0;

        while (x < matriz.length) {
            while (y <  matriz[0].length){
                System.out.print("> Insira um número na Matriz na posicao [" + x + ", " + y + "] -> ");
                matriz[x][y] = input.nextInt();
                y++;
            }
            y = 0;
            x++;
        }
    }

    public static boolean isAscend(int[ ] array){

        int i = 0;
        while (i < array.length){
            if (i < (array.length - 1)){
                if (array[i] > array[i+1]){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static boolean isDescend(int[ ] array){

        int i = 0;
        while (i < array.length){
            if (i < (array.length - 1)){
                if (array[i] < array[i+1]){
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    public static int countOccurrences(int target, int[ ] array){
        int find = 0, i = 0;
        while (i < array.length){
            if (array[i] == target){
                find++;
            }
            i++;
        }
        return find;
    }

    public static int countDups(int[ ] array){
        int i = 0, k, count = 0;
        while (i < array.length) {
            k = 0;
            while (k < i) {
                if (array[i] == array[k]) {
                    count++;
                    break;
                }
                k++;
            }
            i++;
        }
        return count;
    }
    public static int findBiggestNumberInMatriz(int[][] matriz){
        int x = 0, y, maior;

        maior = matriz[0][0];
        while (matriz.length > x){
            y = 0;
            while (matriz[0].length > y){
                if (maior < matriz[x][y])
                    maior = matriz[x][y];
                y++;
            }
            x++;
        }
        return maior;
    }

    public static int findSmallestNumberInMatriz(int[][] matriz){
        int x = 0, y, menor;

        menor = matriz[0][0];
        while (matriz.length > x){
            y = 0;
            while (matriz[0].length > y){
                if (menor > matriz[x][y])
                    menor = matriz[x][y];
                y++;
            }
            x++;
        }
        return menor;
    }

    public static boolean findNumberInMatriz(int[][] matriz, int target) {
        int x = 0, y;

        while (x < matriz.length) {
            y = 0;
            while (y < matriz[x].length) {
                if (target == matriz[x][y])
                    return true;
                y++;
            }
            x++;
        }
        return false;
    }

}
