package FichasPraticas03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num2 = 2;
        System.out.print("- Introduza um numero de inicio:  ");
        num1 = input.nextInt();

        while (num2 <= num1) {
            System.out.println("- " + num2);
            num2 = num2 + 2;
        }
    }
}