package FichasPraticas06;

import java.util.Scanner;

public class ex08 {
    static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){
        int x, y = 0;

        System.out.println("\n");
        while (y < matriz1[0].length)
        {
            x = 0;
            while (x < matriz1.length){
                matriz1[x][y] = matriz1[x][y] + matriz2[x][y];
                x++;
            }
            y++;
        }
        y = 0;
        while (y < matriz1[0].length){
            for (x = 0; x < matriz1.length; x++){
                System.out.print("  " + matriz1[x][y]);
            }
            y++;
            System.out.println("\n");
        }
        while (y < matriz2[0].length){
            for (x = 0; x < matriz2.length; x++){
                System.out.print("  " + matriz2[x][y]);
            }
            y++;
            System.out.println("\n");
        }
    }
    static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){
        int x, y = 0, soma = 0;

        while (y < matriz1[0].length)
        {
            x = 0;
            while (x < matriz1.length){
                soma += matriz1[x][y] + matriz2[x][y];
                x++;
            }
            y++;
        }
        System.out.println("\nA soma dos Arrays de Arrays e: " + soma);
        return soma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[ ][ ] matriz1 = new int[3][3];
        int[ ][ ] matriz2 = new int[3][3];
        int somatorio;

    System.out.println("Preencha a matriz1:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        System.out.print("matriz1[" + i + "][" + j + "]: ");
        matriz1[i][j] = input.nextInt();
        }
    }

    System.out.println("Preencha a matriz2:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        System.out.print("matriz2[" + i + "][" + j + "]: ");
        matriz2[i][j] = input.nextInt();
        }
    }

        somarMatrizes(matriz1, matriz2);
        somatorio = somatorioMatrizes(matriz1, matriz2);
    }
}
