package FichasPraticas02;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Vars
        int lugar;

        // Recolha da dados
        System.out.print("- Indroduza o seu lugar na corrida: ");
        lugar = input.nextInt();
        // Varificacao de posicao
        if (lugar == 1){
            System.out.println("- Ganhou 10 pontos");
        }
        else if (lugar == 2){
            System.out.println("- Ganhou 8 pontos");
        }
        else if (lugar == 3){
            System.out.println("- Ganhou 6 pontos");
        }
        else if (lugar == 4){
            System.out.println("- Ganhou 5 pontos");
        }
        else if (lugar == 5){
            System.out.println("- Ganhou 4 pontos");
        }
        else if (lugar == 6){
            System.out.println("- Ganhou 3 pontos");
        }
        else if (lugar == 7){
            System.out.println("- Ganhou 2 pontos");
        }
        else if (lugar == 8){
            System.out.println("- Ganhou 1 pontos");
        }
        else {
            System.out.println("- Nao ganhou pontos");
        }

    }
}
