package FichasPraticas05;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int x = 0, y = 0, target, i = 0;
        int[][] vetor = new int[3][5];

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
        System.out.print("> Insira um número para pesquisar: ");
        target = input.nextInt();
        while (y < vetor[0].length){
            for (x = 0; x < vetor.length; x++){
                if (vetor[x][y] == target)
                    i++;
            }
            y++;
        }
        System.out.println("\n> Ha " + i + " posições na matriz com o número " + target);
    }
}
