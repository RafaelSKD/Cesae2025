package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        try {
            lerLinhasInteirasdoFicheiro();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void lerLinhasInteirasdoFicheiro() throws FileNotFoundException{
        File file1 = new File("src/FichasPraticas07/Ficheiros/exercicio_04.csv");
        Scanner scanner1 = new Scanner(file1);
        System.out.println();
        String linha;
        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            System.out.println(linha);
        }
        scanner1.close();
    }
}
