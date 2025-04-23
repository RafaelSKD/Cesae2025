package FichasPraticas04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int target, hint, tryes = 0;

        System.out.println("========= JOGO DA ADIVINHA =========\n");
        while (true){
            System.out.println("- Jogador 1 escolha um numero de 0 a 100 -");
            System.out.print("- Jogador 1 -> ");
            target = input.nextInt();
            if (target >= 0 && target <= 100){
                break;
            }
            System.out.print("- ERROR : Numero Invalido\n\n");
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("========= JOGO DA ADIVINHA =========\n");
        System.out.println("\n\n- Jogador 2 - E a tua vez de adivinhar!");
        while (true){
            System.out.print("- Jogador 2  -> ");
            hint = input.nextInt();
            if (hint > target){
                System.out.println("- Numero introduzido superior ao alvo ");
                tryes++;
            } else if (hint < target) {
                System.out.println("- Numero introduzido inferior ao alvo ");
                tryes++;
            }
            else{
                System.out.println("\n- JACKPOT - Encontraste! \n");
                tryes++;
                break;
            }
        }
        System.out.println("- Apenas precisaste de " + tryes + "x tentativas!");
    }
}
