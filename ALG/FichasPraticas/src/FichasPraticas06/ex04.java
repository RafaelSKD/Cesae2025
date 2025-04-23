package FichasPraticas06;

import java.util.Scanner;
import static FichasPraticas06.ex03.*;
public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, opcao;

        System.out.print("> Insira um numero -> ");
        num = input.nextInt();
        System.out.println("\n======= Menu =======");
        System.out.println("\n1. Par ou Ímpar\n" +
                "2. Positivo ou Negativo\n" +
                "3. Primo ou Não Primo\n" +
                "4. Perfeito ou Não Perfeito\n" +
                "5. Triangular ou Não Triangular\n" +
                "6. Trocar de Número\n" +
                "0. Fechar");
        while (true){
            System.out.println("Numero = " + num);
            System.out.print("\n> Insira uma opcao -> ");
            opcao = input.nextInt();
            if (opcao == 0)
                break;
            switch (opcao){
                case 1:
                    if(par(num)){
                        System.out.println("Par");
                    }else{
                        System.out.println("Impar");
                    }
                    break;
                case 2:
                    if(positivo(num)){
                        System.out.println("Positivo");
                    }else{
                        System.out.println("Negativo");
                    }
                    break;
                case 3:
                    if(primo(num)){
                        System.out.println("Primo");
                    }else{
                        System.out.println("Nao Primo");
                    }
                    break;
                case 4:
                    if(perfeito(num)){
                        System.out.println("Perfeito");
                    }else{
                        System.out.println("Nao Perfeito");
                    }
                    break;
                case 5:
                    if(triangular(num)){
                        System.out.println("Triangular");
                    }else{
                        System.out.println("Nao Triangular");
                    }
                    break;
                case 6:
                    System.out.print("> Introduza um novo numero -> ");
                    num = input.nextInt();
                    break;
                default:
                    System.out.println("> ERROR: Opcao Invalida");
            }
        }
    }
}
