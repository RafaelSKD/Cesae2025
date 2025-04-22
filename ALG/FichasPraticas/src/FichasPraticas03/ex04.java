package FichasPraticas03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, i;
        i = 0;

        System.out.print("- Introduza um numero:  ");
        numero = input.nextInt();

        while (i <= numero) {
            System.out.println("- " + i);
            i++;
        }
    }
}