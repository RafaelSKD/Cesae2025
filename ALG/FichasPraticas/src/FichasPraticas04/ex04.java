package FichasPraticas04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, div;
        System.out.println("========= JOGO DOS PRIMOS =========");
        System.out.println("- Introduzir 0 para sair!\n");
        while (true){
            System.out.print("- Introduza um numero primo:  ");
            num = input.nextInt();
            div = 2;
            if (num == 0){
                return;
            }
            if (num == 1){
                System.out.println("- ERROR - Numero introduzido nao e primo !!!");
            }
            while (div <= num){
                if ((num % div) == 0){
                    if (div != num){
                        System.out.println("- ERROR - Numero introduzido nao e primo !!!");
                        break;
                    }
                    else
                        System.out.println("- BOA! Numero introduzido e primo.");
                }
                div++;
            }
        }
    }
}
