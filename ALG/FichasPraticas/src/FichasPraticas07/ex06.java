package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        String src = "src/FichasPraticas07/Ficheiros/exercicio_06.txt";
        String splitter = ",";
        try {
            findTheOlderPersonInFileAndPrint(src, splitter);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findTheOlderPersonInFileAndPrint(String src, String splitter) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        String line, name = "";
        int age, older = 0;

        while (data.hasNextLine()){ //Find older age
            line = data.nextLine();
            String[] nameAge = line.split(splitter);
            age = Integer.parseInt(nameAge[1]);
            if (age > older){
                older = age;
                name = nameAge[0];
            }
        }
        data.close();
        System.out.println(name + " e a pessoa mais velha da lista que tem " + older + " anos.");
    }
}