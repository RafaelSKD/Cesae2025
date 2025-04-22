package FichasPraticas02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1, nr2;

        //Recolha de dados
        System.out.print("- Indroduza um numero: ");
        nr1 = input.nextInt();
        System.out.print("- Indroduza um numero: ");
        nr2 = input.nextInt();

        // Verificar qual o menor e apresentar
        if (nr1 < nr2){
            System.out.print(nr1 + "   " + nr2);
        }
        else{
            System.out.print(nr2 + "   " + nr1);
        }
    }
}
