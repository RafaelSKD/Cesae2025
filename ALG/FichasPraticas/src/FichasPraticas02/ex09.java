package FichasPraticas02;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, nr3;

        //Recolha de dados
        System.out.print("- Indroduza um numero: ");
        nr1 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr2 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr3 = input.nextInt();

        // Verificar qual o menor e apresentar
        if (nr1 < nr2 && nr1 < nr3) {
                System.out.print("- O menor numero:  " + nr1);
        } else if (nr2 < nr1 && nr2 < nr3) {
                System.out.print("- O menor numero:  " + nr2);
        } else {
                System.out.print("- O menor numero:  " + nr3);
        }
    }
}
