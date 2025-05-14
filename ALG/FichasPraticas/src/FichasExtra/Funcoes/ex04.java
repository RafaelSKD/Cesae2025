package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        imprimirTabuada(num);
    }

    public static void imprimirTabuada(int num){
        int i = 1;

        while (i <= 10){
            System.out.println(i + " x " + num + " = " + (num*i));
            i++;
        }
    }
}
