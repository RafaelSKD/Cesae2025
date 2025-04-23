package FichasPraticas06;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int num;

        num = lerNum();
        writeNum(num);
    }

    public static int lerNum() {
        Scanner input = new Scanner(System.in);

        int num = 0;

        while (num <= 0) {
            System.out.print(">  Introduza um número: ");
            num = input.nextInt();
        }
        return (num);
    }

    public static void writeNum(int num) {
        int i = 0;
        System.out.print("> ");
        while (i < num) {
            System.out.print("*");
            i++;
        }
    }
}