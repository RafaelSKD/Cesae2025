package FichasPraticas01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int min, seg, temp, hora;
        int num = 1;
        min = 0;
        seg = 0;
        hora = 0;
        // Ler tempos
        while (num != 6)
        {
            temp = min;
            System.out.print("- Introduza minutos da musica " + num + ":  ");
            min = input.nextInt();
            min = min + temp;

            temp = seg;
            System.out.print("- Introduza segundos da musica " + num + ":  ");
            seg = input.nextInt();
            seg = seg + temp;

            num = num + 1;
        }
        // Converter seg em min
        while (seg >= 60){
            seg = seg - 60;
            min = min + 1;
        }
        // converter min em hora
        while (min >= 60){
            min = min - 60;
            hora = hora + 1;
        }
        // Apresentar resultado
        System.out.print("- Total do Album: " + hora + "h " + min + "m " + seg + "s");
    }
}
