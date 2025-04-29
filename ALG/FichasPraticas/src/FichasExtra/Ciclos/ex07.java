package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0, pos = 0, neg = 0;

        while (true){
            System.out.print("> Insira um número: ");
            i = input.nextInt();
            if (i == 0){
                System.out.println("\n> Números Positivos: " + pos);
                System.out.println("> Números Negativos: " + neg);
                break;
            } else if (i > 0) {
                pos++;
            } else
                neg++;
        }
    }
}
