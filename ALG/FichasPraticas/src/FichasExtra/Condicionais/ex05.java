package FichasExtra.Condicionais;

import java.util.Scanner;
import java.util.Random;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true){
            int target, hint, tryes = 0;
            String option;
            target = random.nextInt(101); // 0 a 100, inclusive 100;
            System.out.println("========= JOGO DA ADIVINHA =========");
            System.out.println("    Escolha um numero de 0-100");
            System.out.println("  Cuidado, so tens 2x Tentativas\n\n");
            while (tryes < 2){
                System.out.print("- Tentativa " + (tryes + 1) + "  -> ");
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
            if (tryes < 2)
                System.out.println("- Apenas precisaste de " + tryes + "x tentativas!");
            else
                System.out.println("\n- Ficaste sem tentativas\n- O numero era: " + target);
            System.out.println("\n- Queres Jogar novamente (S/N) :");
            option = input.next();
            if (option.equalsIgnoreCase("n"))
                break;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }

    }
}
