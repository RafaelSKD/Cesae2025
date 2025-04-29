package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, div = 10, numbreak;

        System.out.print("> Insira um número: ");
        num = input.nextInt();

        while (num > 0) {
            numbreak = num % div;
            System.out.print(numbreak);
            num = num / div;
        }
    }
}
