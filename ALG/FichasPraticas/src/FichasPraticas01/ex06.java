import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs - imp sem a temp
        int nr1, nr2, temp;

        // Ler nr1
        System.out.print("- Introduza um numero:  ");
        nr1 = input.nextInt();

        // Ler nr2
        System.out.print("- Introduza um numero:  ");
        nr2 = input.nextInt();

        // Calc. Soma + Apresentar
        System.out.println("-Antes : numero1 = " + nr1 + "   numero2 = " + nr2);
        temp = nr1;
        nr1 = nr2;
        nr2 = temp;
        System.out.println("-Depois : numero1 = " + nr1 + "   numero2 = " + nr2);
    }
}
