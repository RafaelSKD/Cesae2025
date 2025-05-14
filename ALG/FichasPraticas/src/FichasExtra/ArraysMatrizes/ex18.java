package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Digite colunas: ");
        y = input.nextInt();
        System.out.print("Digite linhas: ");
        x = input.nextInt();
        int[][] matriz = new int[x][y];
        fillMatriz(matriz);
        printMatriz(matriz);
        printMatrizTrans(matriz);
    }

    public static void printMatrizTrans(int[][] matriz) {
        int num, prevNum, spaces;

        System.out.println();
        for (int x = 0; x < matriz[0].length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (y > 0) {
                    prevNum = matriz[y - 1][x];
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
}
