package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex16 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int maior, menor;
        System.out.println("Preenche a matriz: ");
        fillMatriz(matriz1);
        printMatriz(matriz1);
        maior = findBiggestNumberInMatriz(matriz1);
        System.out.println("\nO maior numero e: " + maior);
        menor = findSmallestNumberInMatriz(matriz1);
        System.out.println("\nO menor numero e: " + menor);
    }
}
