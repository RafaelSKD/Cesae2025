package FichasPraticas01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double nr1, nr2, nr3;
        double result;
        // Ler nr1
        System.out.print("- Introduz um numero:  ");
        nr1 = input.nextInt();
        // Ler nr2
        System.out.print("- Introduz outro numero:  ");
        nr2 = input.nextInt();
        // Ler nr3
        System.out.print("- Introduz outro numero:  ");
        nr3 = input.nextInt();
        // Calc. media + Apresentar
        result = (nr1 + nr2 + nr3) / 3;
        System.out.println("- A media e: " + result);
        // Calc. media + Apresenta
        result = (nr1 * 0.2) + (nr2 * 0.3) + (nr3 * 0.5);
        System.out.println("- A media Ponderada em 20%-30%-50% e: " + result);
    }
}
