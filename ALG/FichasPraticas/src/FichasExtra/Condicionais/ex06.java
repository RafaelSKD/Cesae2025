package FichasExtra.Condicionais;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;
        System.out.println("- Insira o ano: ");
        ano = input.nextInt();
        if (ano % 4 == 0)
            System.out.println("- É bissexto !!!");
        else
            System.out.println("-  Não é bissexto !!!");
    }
}
