package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, numcpy, exp, expcpy;

        System.out.print("> Insira um número: ");
        num = input.nextInt();
        numcpy = num;
        System.out.print("> Insira outro número: ");
        exp = input.nextInt();
        expcpy = exp;
        while (exp > 1){
            num *= numcpy;
            exp--;
        }
        System.out.print("> O numero " + numcpy + " elevado a " + expcpy + " = " + num);
    }
}
