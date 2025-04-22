package FichasPraticas02;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int nr1;

        //Recolha de dados
        System.out.print("- Indroduza um numero: ");
        nr1 = input.nextInt();


        // Verificar qual o menor e apresentar
        if ((nr1 % 2) == 0){
            System.out.print("- O numero " + nr1 + " e par!");
        }
        else{
            System.out.print("- O numero " + nr1 + " e impar!");
        }
    }
}
