package FichasPraticas05;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int x = 0, y = 0, soma = 0;
        int[][] vetor = new int[4][4];

        while (y < vetor[0].length) {
            while (x <  vetor.length){
                System.out.print("> Insira um número no Array" + (y + 1) + "[" + x + "]: ");
                vetor[x][y] = input.nextInt();
                x++;
            }
            x = 0;
            y++;
        }
        System.out.println("> A matriz inserida foi : \n");
        y = 0;
        while (y < vetor[0].length){
            for (x = 0; x < vetor.length; x++){
                System.out.print("  " + vetor[x][y]);
            }
            y++;
            System.out.println("\n");
        }
        y = 0;
        x = 0;
        while (x < vetor.length || y < vetor[0].length){
            soma += vetor[x][y];
            y++;
            x++;
        }
        System.out.println("> A soma dos elementos da diagonal principal: " + soma);
    }
}