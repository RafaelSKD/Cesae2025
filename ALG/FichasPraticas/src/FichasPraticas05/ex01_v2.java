package FichasPraticas05;

import java.util.Scanner;

public class ex01_v2 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        int[] vetor = new int[10];

        for(int i =0; i< vetor.length;i++){
            System.out.print("> Insira um número no Array[" + i +"]:");
            vetor[i] = input.nextInt();
        }

        for(int i =0; i< vetor.length;i++){
            System.out.println("> " + vetor[i]);
        }
    }
}
