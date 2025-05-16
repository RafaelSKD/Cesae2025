package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        try {
            calcularSomaNumFile();
            System.out.println("Valor calculado com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void calcularSomaNumFile() throws FileNotFoundException{
        Scanner file1 = new Scanner(new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_05_31.txt"));
        Scanner file2 = new Scanner(new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_05_1999.txt"));


        double num, total1 = 0, total2 = 0;

        while (file1.hasNextInt()){
            num = file1.nextInt();
            total1 += num;
        }
        while (file2.hasNextInt()){
            num = file2.nextInt();
            total2 += num;
        }

        System.out.println("Total1: " + total1);
        System.out.println("Total2: " + total2);
        file1.close();
        file2.close();
    }
}
