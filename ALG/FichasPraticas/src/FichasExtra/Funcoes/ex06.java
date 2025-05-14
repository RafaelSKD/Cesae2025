package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, somatorio;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        somatorio = somatorio(num);
        System.out.print("somatorio: " + somatorio);
    }

    public static int somatorio(int num){
        int somatorio = 0;

        if (num == 0)
            return 0;
        if (num < 0){
            num = -num;
        }
        while (num > 0) {
            somatorio += (num % 10);
            num = num / 10;
        }
        return somatorio;
    }
}
