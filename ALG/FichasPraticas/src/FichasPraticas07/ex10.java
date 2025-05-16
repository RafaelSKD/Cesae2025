package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;
import static Header.console.*;

public class ex10 {
    public static void main(String[] args) {
        String srcOrigin = "src/FichasPraticas07/Ficheiros/exercicio_10.csv";
        String src = "src/FichasPraticas07/NewFiles/exercicio_10.csv";
        String splitter = ",";
        try {
            dupFile(srcOrigin, src);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
        int count, option;
        while (true) {
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
            System.out.println("*School finder\nO que deseja procurar?\n");
            System.out.println("#1- Todos os Formandos");
            System.out.println("#2- Informacoes de um Formando");
            System.out.println("#3- Formandos incritos num Curso");
            System.out.println("#4- Formando mais Velho");
            System.out.println("#5- Formandos que frequentam mais que um Curso");
            System.out.println("#6- Alterar Dados");
            System.out.println("\n#0- Sair");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 6);
        return option;
    }

    public static void dispatcher(String src, String splitter, int option) {
        switch (option) {
            case 1: //imprimir todos os formandos
                findStudentsMenu(src, splitter);
                break;
            case 2: //Dado um número de matrícula, retorne todas as informações do formando.
                findStudentInfoMenu(src, splitter);
                break;
            case 3: //Dado um curso, imprima todos os seus formandos (nome e matrícula) + contagem
                findStudentsOfCourseMenu(src, splitter);
                break;
            case 4: //Imprimir o aluno mais velho.
                findOlderStudentMenu(src, splitter);
                break;
//            case 5: // Imprimir alunos que estão inscritos em mais de um curso.
//                countStudentsMoreThanOneCourseMenu(src, splitter);
//                break;
//            case 6: // Número de formandos no ficheiro.
//                countStudentsMenu(src, splitter);
//                break;
//            case 7: // Menu de edicao
//                editMenu(src, splitter);
//                break;
        }
    }

    public static void findStudentsMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            String genre;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#1- Todos os Formandos\n");
            printContent(src);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findStudentInfoMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            String genre;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#2- Informacoes de um Formando\n");
            System.out.print("Digite o ID do aluno a pesquisar: ");
            String id = input.nextLine();
            System.out.println();
            printContentOccurrences(src, splitter, id, 1, 0, 2, 3, 4);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findStudentsOfCourseMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            String genre;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#3- Formandos incritos num Curso\n");
            System.out.print("Digite o Curso a pesquisar: ");
            String id = input.nextLine();
            System.out.println();
            printContentOccurrences(src, splitter, id, 2, 0, 1);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void findOlderStudentMenu(String src, String splitter) {
        try {
            Scanner input = new Scanner(System.in);
            String genre;
            cleanConsole();
            System.out.println("=========== Menu ===========");
            System.out.println("*School finder\n#4- Formando mais Velho\n");
            String age = findOlderAge(src, splitter);
            System.out.println();
            printContentOccurrences(src, splitter, age, 4, 0, 1, 4);
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static String findOlderAge(String src, String splitter) throws FileNotFoundException{
        Scanner data = new Scanner(new File(src));

        int age, older = 0;

        String line = data.nextLine(); // ignores 1st line
        String olderAge = "";
        while (data.hasNextLine()){
            line = data.nextLine();
            String[] contentLine = line.split(splitter);
            String dupStr = contentLine[4];
            age = Integer.parseInt(dupStr);
            if (age > older){
                older = age;
                olderAge = dupStr;
            }
        }
        data.close();

        return olderAge;
    }

//    public static void countStudentsMoreThanOneCourseMenu(String src, String splitter) {
//        try {
//            Scanner input = new Scanner(System.in);
//            String genre;
//            cleanConsole();
//            System.out.println("=========== Menu ===========");
//            System.out.println("*School finder\n#5- Formandos que frequentam mais que um Curso\n");
//            System.out.println();
//            printContentOccurrencesDup(src, splitter);
//            System.out.print("\n... para continuar digite qualquer coisa ");
//            input.next();
//        } catch (FileNotFoundException e) {
//            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
//        }
//    }

//    public static void printContentOccurrencesDup(String src, String splitter) throws FileNotFoundException{
//        Scanner data = new Scanner(new File(src));
//
//        String ids = findDups(src, splitter);
//        String[] totalIds = ids.split(splitter);
//        for (int i = 0; i < totalIds.length; i++){
//            printContentOccurrences(src, splitter, totalIds[i], 1, 0,1);
//        }
//        data.close();
//    }

//    public static String findDups(String src, String splitter) throws FileNotFoundException {
//        Scanner data = new Scanner(new File(src));
//        String line = data.nextLine(); // ignores 1st line
//        StringBuilder ids = new StringBuilder();
//        while (data.hasNextLine()) {
//            line = data.nextLine();
//            String[] contentLine = line.split(splitter);
//            String dupStr = contentLine[1];
//            Scanner data2 = new Scanner(new File(src));
//            while (data2.hasNextLine()) {
//                line = data2.nextLine();
//                contentLine = line.split(splitter);
//                String dupStr2 = contentLine[1];
//                if (dupStr.equals(dupStr2)) {
//                    String idsCpy = ids.toString();
//                    if (!idsCpy.contains(dupStr)) {
//                        ids.append(dupStr);
//                    }
//                }
//            }
//        }
//        data.close();
//        return ids.toString();
//    }
}