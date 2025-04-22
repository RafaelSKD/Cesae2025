package FichasPraticas01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double nr1, nr2, nr3;
        double result;
        // Ler nr1
        System.out.print("- Introduz o preco do 1* Produto:  ");
        nr1 = input.nextDouble();
        // Ler nr2
        System.out.print("- Introduz o preco do 2* Produto:  ");
        nr2 = input.nextDouble();
        // Ler nr3
        System.out.print("- Introduz o preco do 3* Produto:  ");
        nr3 = input.nextDouble();
        // Calc. Preco
        result = nr1 + nr2 + nr3;
        System.out.println("- Valor total sem desconto: " + result + " $");
        // Calc. Preco c/Desconto
        result = result * 0.90;
        System.out.println("- Valor final com desconto de 10%: " + result + " $");
    }
}
