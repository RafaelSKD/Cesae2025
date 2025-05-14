package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex17 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int maior, menor, maior2, menor2, i;
        System.out.println("Preenche a matriz: ");
        fillMatriz(matriz1);
        printMatriz(matriz1);
        maior = findBiggestNumberInMatriz(matriz1);
        menor = findSmallestNumberInMatriz(matriz1);

        i = 1;
        while (true){
            if ((maior - i) != maior && findNumberInMatriz(matriz1, (maior - i))){
                maior2 = maior - i;
                break;
            }
            i++;
        }

        i = 1;
        while (true){
            if ((menor + i) != menor && findNumberInMatriz(matriz1, (menor + i))){
                menor2 = menor + i;
                break;
            }
            i++;
        }
        System.out.println("\nO segundo maior numero e: " + maior2);
        System.out.println("\nO segundo menor numero e: " + menor2);
    }
}
