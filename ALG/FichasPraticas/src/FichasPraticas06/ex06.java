package FichasPraticas06;

import java.util.Scanner;

import static FichasPraticas06.ex05.*;


public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, x = 0, opcao, maior, menor;
        System.out.print("> Insira o tamanho do vetor desejado -> ");
        i = input.nextInt();
        int[] vetor = new int[i];

        while (x < vetor.length) {
            System.out.print("> Insira o valor na posicao " + (x + 1) + " -> ");
            vetor[x] = input.nextInt();
            x++;
        }
        System.out.println("\n======= Menu =======");
        System.out.println("7. Maior Elemento\n" +
                "8. Menor Elemento\n" +
                "9. Crescente ou Não Crescente\n" +
                "0. Fechar");
        while (true) {
            System.out.print("\n> Insira uma opcao -> ");
            opcao = input.nextInt();
            if (opcao == 0)
                break;
            switch (opcao) {
                case 7:
                    maior = maior(vetor);
                    System.out.println("O Maior Elemento do Vetor e: " + maior);
                    break;
                case 8:
                    menor = menor(vetor);
                    System.out.println("O Menor Elemento do Vetor e: " + menor);
                    break;
                case 9:
                    if (crescente(vetor)) {
                        System.out.println("Crescente");
                    } else {
                        System.out.println("Nao Crescente");
                    }
                    break;
            }
        }
    }
}