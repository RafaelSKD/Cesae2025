package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;
import static Header.console.*;

public class ex09 {
    public static void main(String[] args) {
        String src = "src/FichasPraticas07/Ficheiros/exercicio_09.csv";
        String splitter = ",";
        int count, option;
        while (true){
            option = menu();
            if (option == 0)
                return;
            dispatcher(src, splitter, option);
        }
    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\nO que deseja procurar?\n");
            System.out.println("#1- Genero");
            System.out.println("#2- Artista");
            System.out.println("#3- Maior musica");
            System.out.println("#4- Musicas acima de \"X\" tamanho");
            System.out.println("#5- Quantidade de musicas na Playlist");
            System.out.println("\n#0- Sair");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 5);
        return option;
    }

    public static void dispatcher(String src, String splitter, int option){
        switch (option){
            case 1: //genero
                findGenreMenu(src, splitter);
                break;
            case 2: //artista
                findArtistMenu(src, splitter);
                break;
            case 3: //maior som
                findBiggerSongMenu(src, splitter);
                break;
            case 4:  // sons maiores que
                findSongsBiggerThanMenu(src, splitter);
                break;
            case 5: // qnt musicas
                countMusicsMenu(src, splitter);
                break;
        }
    }

    public static void findGenreMenu(String src, String splitter){
        try {
            Scanner input = new Scanner(System.in);
            String genre;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\n#1- Genero\n");
            System.out.print("Digite o genero a perquisar: ");
            genre = input.nextLine();
            printContentOccurrences(src, splitter, genre, 2, 0, 1);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findArtistMenu(String src, String splitter){
        try {
            Scanner input = new Scanner(System.in);
            String artist;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\n#2- Artista\n");
            System.out.print("Digite o Artista a perquisar: ");
            artist = input.nextLine();
            printContentOccurrences(src, splitter, artist, 1, 0);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findBiggerSongMenu(String src, String splitter){
        try {
            Scanner input = new Scanner(System.in);
            String artist;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\n#3- Maior musica\n");
            findBiggerSongAndPrint(src, splitter);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findBiggerSongAndPrint(String src, String splitter) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        int duration, bigger = 0;
        String musicFinal = "";
        String line = data.nextLine(); // ignores 1st line
        while (data.hasNextLine()){
            line = data.nextLine();
            String[] music = line.split(splitter);
            String durStr = music[3].replace(":", ""); // "12:22" → "1222"
            duration = Integer.parseInt(durStr);
            if (duration > bigger){
                bigger = duration;
                musicFinal = line;
            }
        }
        data.close();
        System.out.println(musicFinal);
    }

    public static void findSongsBiggerThanMenu(String src, String splitter){

        int min = 0, seg = 0;
        try {
            Scanner input = new Scanner(System.in);
            String artist;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\n#4- Musicas acima de \"X\" tamanho\n");
            System.out.print("Digite o tamanho minimo que procura- minutos: ");
            min = input.nextInt();
            System.out.print("                                    segundos: ");
            seg = input.nextInt();
            findBiggerSongsThan(src, splitter, min, seg);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findBiggerSongsThan(String src, String splitter, int min, int seg) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        int limitInSeconds = min * 60 + seg;

        if (data.hasNextLine()) {
            data.nextLine();
        }

        while (data.hasNextLine()) {
            String line = data.nextLine();
            String[] music = line.split(splitter);
            String[] timeParts = music[3].split(":");
            int musicMin = Integer.parseInt(timeParts[0]);
            int musicSeg = Integer.parseInt(timeParts[1]);
            int musicDurationInSeconds = musicMin * 60 + musicSeg;

            if (musicDurationInSeconds > limitInSeconds) {
                System.out.println(line);
            }
        }

        data.close();
    }

    public static void countMusicsMenu(String src, String splitter){
        try {
            Scanner input = new Scanner(System.in);
            int lines;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*Playlist finder\n#5- Quantidade de musicas na Playlist\n");
            lines = countLinesInFile(src);
            System.out.println("Existem " + (lines - 1) + " musicas na Playlist");
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

}