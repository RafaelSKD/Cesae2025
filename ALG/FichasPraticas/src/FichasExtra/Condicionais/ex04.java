package FichasExtra.Condicionais;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char c;
        String vogals = "aeiou";

        System.out.print("- Introduza uma letra do alfabeto:  ");
        c = input.next().charAt(0);

        if (vogals.indexOf(c) != -1)
            System.out.println("- E Vogal.");
        else
            System.out.println("- Nao e vogal.");
    }
}
