package FichasPraticas03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int vc = 0;
        int cq = 0;
        int sc = 0;
        int cm = 0;

        while (true){
            System.out.print("- Introduza um numero:  ");
            numero = input.nextInt();
            if (numero < 0)
                break;
            else if (numero <= 25)
                vc++;
            else if (numero <= 50)
                cq++;
            else if (numero <= 75)
                sc++;
            else if (numero <= 100)
                cm++;
        }
        System.out.println("- [00,25]: " + vc);
        System.out.println("- [26,50]: " + cq);
        System.out.println("- [51,75]: " + sc);
        System.out.println("-[76,100]: " + cm);
    }
}
