package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        try {
            lerLinhasInteirasdoFicheiro();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void lerLinhasInteirasdoFicheiro() throws FileNotFoundException{
        File file1 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_01.txt");
        File file2 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_01_Alternativa01.txt");
        File file3 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_01_Alternativa02.txt");
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);
        Scanner scanner3 = new Scanner(file3);
        System.out.println();
        String linha;
        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            System.out.println(linha);
        }
        System.out.println("\n");
        while (scanner2.hasNextLine()){
            linha = scanner2.nextLine();
            System.out.println(linha);
        }
        System.out.println("\n");
        while (scanner3.hasNextLine()){
            linha = scanner3.nextLine();
            System.out.println(linha);
        }
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
