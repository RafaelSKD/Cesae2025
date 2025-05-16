package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        try {
            CreateAndPrintFile();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }
    public static void CreateAndPrintFile() throws FileNotFoundException{
        String fileContent = "hello world";

        File file = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/NewFiles/exercicio2.output.txt");

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("ola mundo");


        printWriter.close();
    }
}