package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;

public class ex08 {
    public static void main(String[] args) {
        String src = "src/FichasPraticas07/Ficheiros/exercicio_08.csv";
        String splitter = ",";
        int count;
        try {
            calcAndPrintTotalOfSales(src, splitter);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }
    public static void calcAndPrintTotalOfSales(String src, String splitter) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));
        double quant, value, totalProduct, totalSales = 0;

        String linha = data.nextLine(); // ignores 1st line
        while (data.hasNextLine()){
            linha = data.nextLine();
            String[] lineData = linha.split(splitter);
            quant = Double.parseDouble(lineData[2]);
            value = Double.parseDouble(lineData[3]);
            totalProduct = quant * value;
            totalSales += totalProduct;
        }
        System.out.println(totalSales);
    }
}