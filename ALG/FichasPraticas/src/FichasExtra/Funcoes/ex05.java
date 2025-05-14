package FichasExtra.Funcoes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPiada;
        System.out.print("Introduza um número para ouvir uma piada: ");
        numPiada = input.nextInt();
        System.out.print(contarPiada(numPiada));
    }

    public static String contarPiada(int piada){
        String[ ] bibliotecaPiadas = new String[13]; // Exemplo, quantas mais piadas melhor :D

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice";
        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais um porque o filme é para mais de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";
        bibliotecaPiadas[4] = "O que é melhor do que ganhar uma medalha de prata nos paraolímpicos? Não ser deficiente.";
        bibliotecaPiadas[5] = "Qual é a parte do vegetal mais difícil de passar no triturador? A cadeira de rodas";
        bibliotecaPiadas[6] = "Um avião de ajuda humanitária carregadinho de medicamentos para a Etiópia volta para trás. A medicação era para tomar depois da refeição.";
        bibliotecaPiadas[7] = "Qual é o prato favorito do Vaticano? - Arroz de miúdos";
        bibliotecaPiadas[8] = "Qual é a semelhança entre um aeroporto e o IPO ?\nOs terminais.";
        bibliotecaPiadas[9] = "Estava dois canibais a conversa na esplanada e passa uma rapariga sem um braço.\n Um diz para o outro \" vês? É aquela que ando a comer\"";
        bibliotecaPiadas[10] = "O meu avo perdeu a língua na Guerra\nNunca fala sobre o assunto";
        bibliotecaPiadas[11] = "Qual a melhor maneira de tirar pastilha do cabelo??\nQuimioterapia";
        bibliotecaPiadas[12] = "Qual é a diferença entre Jesus Cristo e uma pintura de Jesus Cristo?\nA pintura apenas precisa de um prego para ser pendurada.";

        return bibliotecaPiadas[piada];
    }
}
