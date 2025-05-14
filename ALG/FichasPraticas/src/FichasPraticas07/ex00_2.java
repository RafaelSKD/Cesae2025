package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex00_2 {
    public static void main(String[] args) {
        try {
            calcularTotaldasCompras();
            System.out.println("Valor calculado com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void calcularTotaldasCompras() throws FileNotFoundException{
        Scanner data = new Scanner(new File("C:/Users/sw13/Desktop/Cesae2025/ALG/FichasPraticas/src/FichasPraticas07/data.txt"));

        String linha = data.nextLine();

        int item;
        String seccao, produto;
        double quantidade, valor, total = 0;

        while (data.hasNextLine()){
            item = data.nextInt();
            seccao = data.next();
            produto = data.next();
            quantidade = data.nextDouble();
            valor = data.nextDouble();

            total += valor;
        }
        System.out.println("Total: " + total);
        data.close();
    }
}
