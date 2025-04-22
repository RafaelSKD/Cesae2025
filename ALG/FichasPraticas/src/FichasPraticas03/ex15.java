package FichasPraticas03;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int total;

        System.out.print("- Introduza um numero:  ");
        num = input.nextInt();
        total = num;
        while(num > 1){
            total = total * (num -1);
            num--;
        }
        System.out.print("- total = " + total);
    }
}