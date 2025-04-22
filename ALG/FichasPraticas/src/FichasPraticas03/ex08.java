package FichasPraticas03;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, i, j, num;
        i = 5;
        j = 1;

        System.out.print("- Introduza um numero:  ");
        numero = input.nextInt();

        while (i > 0) {
            num = numero - i;
            System.out.println("- " + num);
            i--;
        }
        System.out.print("\n");
        while (j <= 5) {
            num = numero + j;
            System.out.println("- " + num);
            j++;
        }
    }
}
