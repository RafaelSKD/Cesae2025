package FichasPraticas05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int x = 0, y = 0, maior;
        int[][] vetor = new int[3][3];

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
                System.out.print("      " + vetor[x][y]);
            }
            y++;
            System.out.println("\n");
        }
        y = 0;
        maior = vetor[0][0];
        while (y < vetor[0].length){
            for (x = 0; x < vetor.length; x++){
                if (maior < vetor[x][y])
                    maior = vetor[x][y];
            }
            y++;
        }
        System.out.println("> O maior numero da matriz e : " + maior);
    }
}
