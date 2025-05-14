package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letra;

        System.out.print("Introduza uma letra: ");
        letra = input.nextLine().charAt(0);

        if(isVogal(letra)) {
            System.out.print("E vogal !!!");
            return;
        }
        System.out.print("Nao e vogal !!!");
    }

    public static boolean isVogal(char a){
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' ||a == 'u')
            return true;
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' ||a == 'U')
            return true;
        return false;
    }
}
