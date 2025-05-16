package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;

public class ex07 {
    public static void main(String[] args) {
        String src = "src/FichasPraticas07/Ficheiros/exercicio_07.txt";
        String splitter = " ";
        int count;
        try {
            count = countLinesInFile(src);
            System.out.println("existem " + count + " linhas no ficheiro");
            count = countWordsInFile(src, splitter);
            System.out.println("existem " + count + " palavras no ficheiro");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }
}