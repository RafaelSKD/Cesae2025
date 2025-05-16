package Header;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class files {
//    public static void main(String[] args) {
//        String src = "src/FichasPraticas07/Ficheiros/exercicio_01.txt";
//        String splitter = " ";
//        String[] str;
//        int i = 0;
//        try {
//            str = tokenContentInArrayStr(src, splitter);
//            printArrayOfStr(str);
//        } catch (FileNotFoundException e) {
//            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
//        }
//    }

    public static void printContent(String src) throws FileNotFoundException {
        Scanner data = new Scanner(new File(src));

        String linha = data.nextLine();

        while (data.hasNextLine()){
            linha = data.nextLine();
            System.out.println(linha);
        }
        data.close();
    }

    public static String[] tokenContentInArrayStr(String src, String splitter) throws FileNotFoundException {
        Scanner contador = new Scanner(new File(src));
        Scanner leitor = new Scanner(new File(src));
        int totalTokens = 0, i = 0;

        while (contador.hasNextLine()) {
            String linha = contador.nextLine();
            String[] partes = linha.split(splitter);
            totalTokens += partes.length;
        }
        String[] resultado = new String[totalTokens];
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] partes = linha.split(splitter);
            while (i < partes.length) {
                resultado[i] = partes[i];
                i++;
            }
        }
        contador.close();
        leitor.close();
        return resultado;
    }

    public static int[] tokenContentInArrayInt(String src, String splitter) throws FileNotFoundException {
        Scanner contador = new Scanner(new File(src));
        Scanner leitor = new Scanner(new File(src));
        int totalTokens = 0, i = 0;

        while (contador.hasNextLine()) {
            String linha = contador.nextLine();
            String[] partes = linha.split(splitter);
            totalTokens += partes.length;
        }
        int[] resultado = new int[totalTokens];
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            String[] partes = linha.split(splitter);
            while (i < partes.length) {
                resultado[i] = Integer.parseInt(partes[i]);  //converter para int
                i++;
            }
        }
        contador.close();
        leitor.close();

        return resultado;
    }

    public static void dupFile(String pathOrigin, String pathToGo) throws FileNotFoundException{
        File file1 = new File(pathOrigin);
        File file2 = new File(pathToGo);

        Scanner scanner1 = new Scanner(file1);
        PrintWriter file2Writer = new PrintWriter(file2);

        String linha;

        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            file2Writer.println(linha);
        }
        scanner1.close();
        file2Writer.close();
    }

    public static int countLinesInFile(String src) throws FileNotFoundException {
        int count = 0;
        File file = new File(src);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            scanner.nextLine();  // Move para a proxima linha
            count++;
        }

        scanner.close();
        return count;
    }

    public static int countWordsInFile(String src, String splitter) throws FileNotFoundException {
        File file = new File(src);
        Scanner scanner = new Scanner(file);

        String[] tokens = tokenContentInArrayStr(src, splitter);
        scanner.close();
        return tokens.length;
    }

    public static void printContentOccurrences(String src, String splitter, String target, int targetPosition, int... targetContents) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        if (data.hasNextLine()) {
            data.nextLine(); // ignora a 1ª linha
        }

        while (data.hasNextLine()) {
            String line = data.nextLine();
            String[] lineData = line.split(splitter);

            if (lineData.length > targetPosition && lineData[targetPosition].equals(target)) {
                for (int index : targetContents) {
                    if (index < lineData.length) {
                        System.out.println(lineData[index]);
                    } else {
                        System.out.println("[ERRO] Índice fora do limite: " + index);
                    }
                }
                System.out.println();
            }
        }

        data.close();
    }
}
