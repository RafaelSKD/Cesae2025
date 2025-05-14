package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex14 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];
        System.out.println("Preenche a matriz 1: ");
        fillMatriz(matriz1);
        System.out.println("Preenche a matriz 2: ");
        fillMatriz(matriz2);
        concatMatriz(matriz1, matriz2, matriz3);
        printMatriz(matriz1);
        printMatriz(matriz2);
        printMatriz(matriz3);
    }

    public static void concatMatriz(int[][] matriz1, int[][] matriz2, int[][] matriz3){
        int x = 0, y;
        while (matriz1.length > x){
            y = 0;
            while (matriz1[0].length > y){
                matriz3[x][y] = matriz1[x][y] + matriz2 [x][y];
                y++;
            }
            x++;
        }
    }
}
