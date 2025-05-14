package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex00_3 {
    public static void main(String[] args) {
        String seccao = "frutas";
        try {
            totalGastoSeccao(seccao);
            System.out.println("Total da Seccao calculado com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void totalGastoSeccao(String seccao) throws FileNotFoundException{
        Scanner data = new Scanner(new File("src/FichasPraticas07/data.txt"));

        String linha = data.nextLine();
        int item;
        String produto;
        double total = 0;

        while (data.hasNextLine()){
            linha = data.nextLine();
            String[] itemsDaLinha = linha.split(" ");

            if (seccao.equals(itemsDaLinha[1])){
                total += Double.parseDouble(itemsDaLinha[4]);
            }
        }
        System.out.println("Seccao [" + seccao + "] total: " + total);

        data.close();
    }
}
