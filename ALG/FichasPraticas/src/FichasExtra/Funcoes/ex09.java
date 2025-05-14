package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        do {
            System.out.print("Introduza um numero de 0 a 12: ");
            num = input.nextInt();
        } while (num < 1 || num > 12);

        System.out.print(whatMonth(num));
    }

    public static String whatMonth(int num){
        String[ ] mesesDoAno = new String[13];

        mesesDoAno[0] = "null";
        mesesDoAno[1] = "Janeiro";
        mesesDoAno[2] = "Fevereiro";
        mesesDoAno[3] = "Marco";
        mesesDoAno[4] = "Abril";
        mesesDoAno[5] = "Maio";
        mesesDoAno[6] = "Junho";
        mesesDoAno[7] = "Julho";
        mesesDoAno[8] = "Agosto";
        mesesDoAno[9] = "Setembro";
        mesesDoAno[10] = "Outubro";
        mesesDoAno[11] = "Novembro";
        mesesDoAno[12] = "Dezembro";

        return mesesDoAno[num];
    }
}
