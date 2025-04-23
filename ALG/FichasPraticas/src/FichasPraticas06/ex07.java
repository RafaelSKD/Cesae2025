package FichasPraticas06;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas, colunas, y = 0, x = 0;
        char a;

        System.out.print("> Introduza um caracter: ");
        a = input.next().charAt(0);
        System.out.print("> Introduza número de linhas: ");
        linhas = input.nextInt();
        System.out.print("> Introduza número de colunas: ");
        colunas = input.nextInt();

        while (y < linhas){
            if (y == 0 || y == (linhas-1)){
                x = 0;
                while (x < colunas){
                    System.out.print(" " + a + " ");
                    x++;
                }
                System.out.print('\n');
            }
            else{
                x = 0;
                System.out.print(" " + a + " ");
                while(x < (colunas - 2)){
                    System.out.print(" " + " " + " ");
                    x++;
                }
                System.out.print(" " + a + " ");
                System.out.print('\n');
            }
            y++;
        }
    }
}
