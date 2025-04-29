package FichasExtra.Condicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco;

        System.out.print("- Introduza o preço:  ");
        preco = input.nextDouble();

        if (preco > 100){
            preco = preco * 0.9;
            System.out.println("- Preço Final: " + (int)preco + " (10% de desconto)");
        }
        else
            System.out.println("- Preço Final: " + (int)preco + " Sem desconto");
    }
}
