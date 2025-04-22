package FichasPraticas02;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2, nr3, ordem;

        //Recolha de dados
        System.out.print("- Indroduza um numero: ");
        nr1 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr2 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr3 = input.nextInt();
        System.out.print("- Ordem (C) Crescente ou (D) Decrescente (C/D): ");
        ordem = input.next().charAt(0);

        // Crescente
        if (ordem == 'C' || ordem == 'c'){
            if (nr1 < nr2 && nr1 < nr3) {
                if (nr2 < nr3)
                    System.out.print(nr1 + "   " + nr2 + "   " + nr3);
                else
                    System.out.print(nr1 + "   " + nr3 + "   " + nr2);
            } else if (nr2 < nr1 && nr2 < nr3) {
                if (nr1 < nr3)
                    System.out.print(nr2 + "   " + nr1 + "   " + nr3);
                else
                    System.out.print(nr2 + "   " + nr3 + "   " + nr1);
            } else {
                if (nr1 < nr2)
                    System.out.print(nr3 + "   " + nr1 + "   " + nr2);
                else
                    System.out.print(nr3 + "   " + nr2 + "   " + nr1);
            }
        }
        if (ordem == 'D' || ordem == 'd'){
            if (nr1 > nr2 && nr1 > nr3) {
                if (nr2 > nr3)
                    System.out.print(nr1 + "   " + nr2 + "   " + nr3);
                else
                    System.out.print(nr1 + "   " + nr3 + "   " + nr2);
            } else if (nr2 > nr1 && nr2 > nr3) {
                if (nr1 > nr3)
                    System.out.print(nr2 + "   " + nr1 + "   " + nr3);
                else
                    System.out.print(nr2 + "   " + nr3 + "   " + nr1);
            } else {
                if (nr1 > nr2)
                    System.out.print(nr3 + "   " + nr1 + "   " + nr2);
                else
                    System.out.print(nr3 + "   " + nr2 + "   " + nr1);
            }
        }

    }
}
