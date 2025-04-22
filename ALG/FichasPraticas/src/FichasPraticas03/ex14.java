package FichasPraticas03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int limite, num = 0, prev, i = 1, alert = 0;

        System.out.print("- Quantos números deseja inserir: ");
        limite = input.nextInt();
        while (i <= limite){
            prev = num;
            System.out.print("- Introduza um numero:  ");
            num = input.nextInt();
            if (prev > num)
                alert = 1;
            prev = num;
            i++;
        }
        if (alert == 1)
            System.out.print("-  Não crescente");
        else
            System.out.print("-  Crescente");
    }
}