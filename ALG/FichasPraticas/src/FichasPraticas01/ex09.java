package FichasPraticas01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        // Criacao do scanner
        Scanner input = new Scanner(System.in);

        // Declr. VARs
        double irs, ss, ep, valor, rendimento;
        int codigo, dias, dia, sub;

        // Pedido de Info
        System.out.println("---- Calculadora de vencimento ----\n");
        System.out.print("Introduzir Codigo de funcionario: ");
        codigo = input.nextInt();
        System.out.print("Introduzir dias trabalhados: ");
        dias = input.nextInt();

        // Valores
        sub = 5;
        dia = 40;
        irs = 0.1;
        ss = 0.11;
        ep = 0.2375;

        // Operacoes + Apresentacao de resultados
        rendimento = (dia * dias) + (dias * sub);
        System.out.println("\nValor iliquido: " + rendimento + " $");
        sub = sub * dias;
        System.out.println("Valor Sub. refeicao: " + sub + " $");
        irs = irs * rendimento;
        System.out.println("Valor de retencao de IRS: " + irs + " $");
        ss = rendimento * ss;
        System.out.println("Valor a entregar Seg.Social: " + ss + " $");
        ep = rendimento * ep;
        System.out.println("Valor a entregar Seg. pela entidade patronal: " + ep + " $");
        valor = rendimento - irs - ss;
        System.out.println("Valor liquido a receber pelo funcionario: " + valor + " $");
    }
}
