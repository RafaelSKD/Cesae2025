package FichasExtra.Funcoes;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import static Header.array.*;
import static Header.console.*;
import static Header.print.*;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, tipologia;
        double area, valor;
        do{
            cleanConsole();
            System.out.println("===== Comparadora Preco dos Terrenos / Mercado =====\n");
            System.out.print("Qual a forma do terreno que pretende calcular :\n" +
                    "#1- RETANGULO\n#2- QUADRADO\n#3- TRIANGULAR\n#4- CIRCULAR\n\nEscolha uma opcao (1-4)- ");
            opcao = input.nextInt();
        }while (opcao < 1 || opcao > 4);
        area = areaCalc(opcao);
        cleanConsole();
        do{
            cleanConsole();
            System.out.println("===== Calculadora Preco dos terrenos =====\n");
            System.out.print("Qual a tipologia do terreno a calcular :\n" +
                    "#1- URBANO\n#2- URBANIZAVEL\n#3- RUSTICO\n\nEscolha uma opcao (1-3)- ");
            opcao = input.nextInt();
        }while (opcao < 1 || opcao > 3);
        System.out.print("Qual o valor total pretendido pelo terreno em ($): ");
        valor = input.nextDouble();
        System.out.println("O valor do m2: " + (int)(valor / area) + "$/m2");
        priceCalc(opcao, area, valor);
    }

    public static double areaCalc(int opcao){
        Scanner input = new Scanner(System.in);

        double largura, comprimento, lado, base, alturaTriangulo, raio, PI = Math.PI;

        switch (opcao){
            case 1 :
                System.out.print("Digite a largura do terreno (em m)- ");
                largura = input.nextDouble();
                System.out.print("Digite o comprimento do terreno (em m)- ");
                comprimento = input.nextDouble();
                return (largura * comprimento);
            case 2 :
                System.out.print("Digite o lado do terreno (em m)- ");
                lado = input.nextDouble();
                return (lado * lado);
            case 3 :
                System.out.print("Digite o lado maior do terreno (em m)- ");
                base = input.nextDouble();
                System.out.print("Digite a distancia do meio desse lado ate ao canto mais afastado (em m)- ");
                alturaTriangulo = input.nextDouble();
                return ((base * alturaTriangulo) / 2);
            case 4 :
                System.out.print("Digite o raio do terreno (em m)- ");
                raio = input.nextDouble();
                return (PI * (raio * raio));
        }
        return 0;
    }

    public static void priceCalc(int opcao, double area, double valor) {
        double valorM2 = (valor / area);
        double excedente;

        switch (opcao) {
            case 1: // urbano - 450 - 750
                if (valorM2 < 450) {
                    System.out.println("\nO Terreno está abaixo do valor de mercado.");
                    excedente = 450 - valorM2;
                    System.out.println("Aconselhamento de um incremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                    excedente = 750 - valorM2;
                    System.out.println("Valor do terreno máximo dentro da média: "
                            + (int)(750 * area) + "$");
                } else if (valorM2 > 750) {
                    System.out.println("\nO Terreno está acima do valor de mercado.");
                    excedente = valorM2 - 750;
                    System.out.println("Aconselhamento de um decremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                } else {
                    System.out.println("O Terreno está dentro do valor de mercado!");
                }
                break;

            case 2: // urbanizável - 150 - 500
                if (valorM2 < 150) {
                    System.out.println("\nO Terreno está abaixo do valor de mercado.");
                    excedente = 150 - valorM2;
                    System.out.println("Aconselhamento de um incremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                    excedente = 500 - valorM2;
                    System.out.println("Valor do terreno máximo dentro da média: "
                            + (int)(500 * area) + "$");
                } else if (valorM2 > 500) {
                    System.out.println("\nO Terreno está acima do valor de mercado.");
                    excedente = valorM2 - 500;
                    System.out.println("Aconselhamento de um decremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                } else {
                    System.out.println("O Terreno está dentro do valor de mercado!");
                }
                break;

            case 3: // rústico - 20 - 60
                if (valorM2 < 20) {
                    System.out.println("\nO Terreno está abaixo do valor de mercado.");
                    excedente = 20 - valorM2;
                    System.out.println("Aconselhamento de um incremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                    excedente = 60 - valorM2;
                    System.out.println("Valor do terreno máximo dentro da média: "
                            + (int)(60 * area) + "$");
                } else if (valorM2 > 60) {
                    System.out.println("\nO Terreno está acima do valor de mercado.");
                    excedente = valorM2 - 60;
                    System.out.println("Aconselhamento de um decremento no valor do terreno de "
                            + (int)(excedente * area) + "$ para entrar na média do mercado.");
                } else {
                    System.out.println("O Terreno está dentro do valor de mercado!");
                }
                break;
        }
    }
}














