package Header;

import java.util.Scanner;

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

}
