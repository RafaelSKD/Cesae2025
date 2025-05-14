package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double largura, altura, area;
        System.out.print("Introduza uma altura: ");
        altura = input.nextDouble();
        System.out.print("Introduza uma largura: ");
        largura = input.nextDouble();


        area = area(altura, largura);
        System.out.print("a area do retangulo e: " + area);
    }

    public static double area(double altura, double largura){
        double area;

        area = (altura * largura);
        return area;
    }
}
