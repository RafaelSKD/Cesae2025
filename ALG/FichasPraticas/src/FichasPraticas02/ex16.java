package FichasPraticas02;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int valor, temp, cc, c, l, xx, x, v, soma;
        valor = 0;
        temp = 0;
        cc = 0;
        c = 0;
        l = 0;
        xx = 0;
        x = 0;
        v = 0;
        soma = 0;

        //Recolha de dados
        System.out.print("- Indroduza um valor em euros (multiplo de 5): ");
        valor = input.nextInt();
        if (valor % 10 == 5 || valor % 10 == 0){
            while (valor > 0)
            {
                if (valor >= 200){
                    cc++;
                    temp = valor - 200;
                } else if (valor >= 100) {
                    c++;
                    temp = valor - 100;
                } else if (valor >= 50) {
                    l++;
                    temp = valor - 50;
                } else if (valor >= 20) {
                    xx++;
                    temp = valor - 20;
                } else if (valor >= 10) {
                    x++;
                    temp = valor - 10;
                } else{
                    v++;
                    temp = valor - 5;
                }
                valor = temp;
            }
            soma = cc + c + l + xx + x + v;
            System.out.println("- O minimo de notas para destrocar sao: " + soma);
            System.out.println("\n- Respetivamente: " + cc + "x de 200 + " + c + "x de 100 + " + l + "x de 50 + " + xx + "x de 20 + " + x + "x de 10 + " + v + "x de 5");
        }
        else{
            System.out.print("- Valor introduzido nao e multiplo de 5");
            return;
        }

    }
}