package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex00_1 {
    public static void main(String[] args) {
        try {
            lerLinhasInteirasdoFicheiro();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void lerLinhasInteirasdoFicheiro() throws FileNotFoundException{
        Scanner data = new Scanner(new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/data.txt"));

        String linha = data.nextLine();
        while (data.hasNextLine()){
            linha = data.nextLine();
            System.out.println(linha);
        }

        data.close();
    }
}
