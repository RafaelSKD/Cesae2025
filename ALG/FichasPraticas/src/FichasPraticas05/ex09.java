package FichasPraticas05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int x = 0, y = 0, soma = 0;
        int[][] vetor = new int[5][5];

        while (y < vetor[0].length) {
            while (x <  vetor.length){
                System.out.print("> Insira um número na Matriz na posicao [" + x + ", " + y + "] -> ");
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
        while (y < vetor[0].length){
            for (x = 0; x < vetor.length; x++){
                soma += vetor[x][y];
            }
            y++;
        }
        System.out.println("> A soma de todos os elementos da matriz e : " + soma);
    }
}
