package FichasPraticas03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, i;
        i = 0;
        System.out.print("- Introduza um limite:  ");
        num1 = input.nextInt();
        System.out.print("- Introduza um salto:  ");
        num2 = input.nextInt();

        while (i <= num1) {
            System.out.println("- " + i);
            i = i + num2;
        }
    }
}