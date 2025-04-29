package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, numcpy, qnt = 1, div = 1, zero, numbreak = 0, result = 0;

        System.out.print("> Insira um número: ");
        num = input.nextInt();
        numcpy = num;

        while (numcpy / 10 != 0) {
            qnt++;
            numcpy /= 10;
        }

        numcpy = num;
        zero = qnt - 1;
        while (zero > 0) {
            div *= 10;
            zero--;
        }

        while (div > 0) {
            numbreak = num / div;
            System.out.print(numbreak);
            result += numbreak;
            num = num % div;
            div /= 10;

            if (div > 0) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + result);
    }
}
