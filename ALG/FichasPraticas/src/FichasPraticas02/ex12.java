package FichasPraticas02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int opcao;

        // criacao de menu = guardar opcao
        System.out.println("========= MENU =========");
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = input.nextInt();

        // finalizacao
        if (opcao == 1)
            System.out.println("\nOpcao escolhida = 1. Criar");
        else if (opcao == 2)
            System.out.println("\nOpcao escolhida = 2. Atualizar");
        else if (opcao == 3)
            System.out.println("\nOpcao escolhida = 3. Eliminar");
        else if (opcao == 4)
            return;
        else
            System.out.println("\nOpcao escolhida = INVALIDA");
    }
}
