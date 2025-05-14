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
        Scanner data = new Scanner(new File("src/FichasPraticas07/Ficheiros/exercicio_01.txt"));
        File file = new File("src/FichasPraticas07/Ficheiros/exercicio_01_newFile.txt"));
        Formatter formatter = new Formatter(file);

        String linha;

        String texto = "programação";
        formatter.format(texto);

        while (data.hasNextLine()){
            linha = data.nextLine();
            linha.hasNextLine();

        }

        data.close();
    }
}
