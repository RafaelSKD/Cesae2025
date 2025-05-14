package Header;
import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class print {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println("- Array[" + i + "] = " + array[i]);
    }

    public static void printMatriz(int[][] matriz) {
        int num, prevNum, spaces;

        System.out.println();
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                if (x > 0) {
                    prevNum = matriz[y][x - 1];
                    spaces = 6 - countNumbers(prevNum);
                    for (int i = 0; i < spaces; i++) {
                        System.out.print(" ");
                    }
                }
                num = matriz[y][x];
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void printMatrizStr(String[][] matriz) {
        String str;

        System.out.println();
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                str = matriz[y][x];
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
