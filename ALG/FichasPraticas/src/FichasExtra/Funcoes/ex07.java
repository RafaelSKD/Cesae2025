package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, inversao;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        inversao = inversao(num);
        System.out.print("inversao: " + inversao);
    }

    public static int inversao(int num){
        int inversao = 0, flag = 0;

        if (num == 0)
            return 0;
        if (num < 0){
            num = -num;
            flag = 1;
        }

        while (num > 0){
            inversao = inversao * 10 + num % 10;
            num /= 10;
        }

        if (flag == 1)
            return -inversao;
        return inversao;
    }
}
