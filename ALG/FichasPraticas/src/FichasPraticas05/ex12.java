package FichasPraticas05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int x = 0, y = 0;
        int[][] vetor = new int[10][2];

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
        while (x < vetor.length){
            for (y = 0; y < vetor[0].length; y++){
                System.out.print("  " + vetor[x][y]);
            }
            x++;
            System.out.println("\n");
        }
    }
}
