package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class ex00_0 {
    public static void main(String[] args) {
        try {
            usingPrintWriter();
            usingFormatter();
            System.out.println("Ficheiro escrito com sucesso!");
            usingScanner();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }


    public static void usingPrintWriter() throws FileNotFoundException {

        String fileContent = "hello world";

        File file = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/ex00_0_PW_Output.txt");

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("ola mundo");


        printWriter.close();
    }

    public static void usingFormatter() throws FileNotFoundException {

        String fileContent = "\nhello world";

        File file = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/ex00_0_F_Output.txt");

        Formatter formatter = new Formatter(file);

        formatter.format(fileContent + "\n\n");
        formatter.format("Para escrever no ficheiro\n");
        formatter.format("Estou a usar o formatter\n");
        formatter.format("Mas ja usei o printWriter\n");
        formatter.format("222");

        formatter.close();
    }

    public static void usingScanner() throws FileNotFoundException {

        File file = new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/ex00_0_F_Output.txt");
        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextInt());

        scanner.close();
    }
}
