package FichasPraticas03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, i;
        String mensagem;
        i = 0;

        System.out.print("- Introduza um numero:  ");
        numero = input.nextInt();

        // Limpar buffer
        input.nextLine();

        System.out.print("- Introduza uma mensagem:  ");
        mensagem = input.nextLine();
        System.out.print("\n");

        while (i < numero) {
            System.out.println("- " + mensagem);
            i++;
        }
    }
}
