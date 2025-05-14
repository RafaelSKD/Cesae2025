package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex15 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][2];
        int media;
        System.out.println("Preenche a matriz: ");
        fillMatriz(matriz1);
        printMatriz(matriz1);
        media = mediaMatriz(matriz1);
        System.out.println("\nA media e: " + media);
    }

    public static int mediaMatriz(int[][] matriz1){
        int x = 0, y, soma = 0, totalNumbers = 0, media;
        while (matriz1.length > x){
            y = 0;
            while (matriz1[0].length > y){
                soma += matriz1[x][y];
                totalNumbers++;
                y++;
            }
            x++;
        }
        media = soma / totalNumbers;
        return media;
    }
}
