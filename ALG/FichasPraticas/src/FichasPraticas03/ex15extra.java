package FichasPraticas03;

import java.util.Scanner;

public class ex15extra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int total;
        int next;
        int mult;

        System.out.print("- Introduza um numero:  ");
        num = input.nextInt();
        next = num - 1;
        total = num;
        while(next > 1){
            mult = total;
            while (next > 1){
                mult = mult + total;
                next--;
            }
            total = mult;
            num = num - 1;
            next = num - 1;
        }
        System.out.print("- total = " + total);
    }
}