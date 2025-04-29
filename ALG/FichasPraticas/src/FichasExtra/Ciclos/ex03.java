package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, result;

        while (true){
            System.out.println("\n\n  ===== TABUADA =====");
            System.out.print("\n- Introduza um numero:  ");
            i = input.nextInt();
            if (i == 0)
                break;
            System.out.println("\n- Tabuada do " + i + ":");
            for (int x = 1; x <= 10; x++){
                result = i * x;
                System.out.println("                " + i + " x " + x + " = " + result);
            }
        }
    }
}
