package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        try {
            dupFileAll();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void dupFileAll() throws FileNotFoundException{
        File file1 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_03.txt");
        File file2 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/Ficheiros/exercicio_03_Alternativa01.txt");
        File file3 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/NewFiles/exercicio_03_cpy.txt");
        File file4 = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/NewFiles/exercicio_03_Alternativa01_cpy.txt");

        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        PrintWriter file3Writer = new PrintWriter(file3);
        PrintWriter file4Writer = new PrintWriter(file4);

        String linha;

        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            System.out.println(linha);
            file3Writer.println(linha);
        }

        while (scanner2.hasNextLine()){
            linha = scanner2.nextLine();
            System.out.println(linha);
            file4Writer.println(linha);
        }

        scanner1.close();
        scanner2.close();
        file3Writer.close();
        file4Writer.close();
    }
}






