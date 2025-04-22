package FichasPraticas03;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int i = 0;
        int temp = 0;
        int soma = 0;

        while (true){
            temp = numero;
            System.out.print("- Introduza um numero:  ");
            numero = input.nextInt();
            if (numero == -1)
                break;
            soma += numero;
            i++;
        }
        soma = soma / i;
        System.out.print("\n- Media:  " + soma);
    }
}
