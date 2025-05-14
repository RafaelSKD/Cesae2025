package FichasExtra.Funcoes;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import static Header.array.*;
import static Header.console.*;
import static Header.print.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        char opcao;


        while (true){
            String[][] galo = new String[3][3];
            String filler = " _ ";

            fillMatrizWith(filler, galo);
            while (true){
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                printMatrizStr(galo);
                do{
                    System.out.print("\nX - Jogador 1 \nLinha: ");
                    x = input.nextInt();
                    System.out.print("Coluna: ");
                    y = input.nextInt();
                }while (!fillMatrizIn(galo, x, y, " X "));
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                printMatrizStr(galo);
                if (toWin(galo, " X ")){
                    break;
                }
                if (toWin(galo, " O ")){
                    break;
                }
                if (toTie(galo, filler)){
                    break;
                }
                do{
                    System.out.print("\nO - Jogador 2\n \nLinha: ");
                    x = input.nextInt();
                    System.out.print("Coluna: ");
                    y = input.nextInt();
                }while (!fillMatrizIn(galo, x, y, " O "));
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                printMatrizStr(galo);
                if (toWin(galo, " X ")){
                    break;
                }
                if (toWin(galo, " O ")){
                    break;
                }
                if (toTie(galo, filler)){
                    break;
                }

            }
            do{
                input.nextLine();
                System.out.println("\n\nNovo Jogo (S/N): ");
                opcao = input.nextLine().charAt(0);
            } while (opcao != 's' && opcao != 'S' && opcao != 'n' && opcao != 'N');

            if (opcao == 'n' || opcao == 'N')
                break;
        }


    }
    public static void fillMatrizWith(String filler, String[][] galo){
        int y = 0, x = 0;

        while (x < galo.length) {
            while (y <  galo[0].length){
                galo[x][y] = filler;
                y++;
            }
            y = 0;
            x++;
        }
    }

    public static boolean fillMatrizIn(String[][] galo, int x,int y, String filler){
        if (x >= galo.length || x < 0)
            return false;
        if (y >= galo.length || y < 0)
            return false;
        if (!galo[x][y].equals(" _ "))
            return false;
        else{
            galo[x][y] = filler;
            return true;
        }
    }

    public static boolean toWin(String[][] galo, String filler){
        int x = 0;

        while (x < galo.length){
            if (galo[x][0].equals(filler) && galo[x][1].equals(filler) && galo[x][2].equals(filler)){
                if (filler.equals(" X ")){
                    cleanConsole();
                    System.out.println("===== Jogo do Galo =====\n");
                    System.out.println("\nX - Jogador 1\n=== GANHOU ===");
                    printMatrizStr(galo);
                    return true;
                }
                if (filler.equals(" O ")){
                    cleanConsole();
                    System.out.println("===== Jogo do Galo =====\n");
                    System.out.println("\nO - Jogador 2\n=== GANHOU ===");
                    printMatrizStr(galo);
                    return true;
                }
            }
            x++;
        }

        int y = 0;

        while (y < galo[0].length){
            if (galo[0][y].equals(filler) && galo[1][y].equals(filler) && galo[2][y].equals(filler)){
                if (filler.equals(" X ")){
                    cleanConsole();
                    System.out.println("===== Jogo do Galo =====\n");
                    System.out.println("\nX - Jogador 1\n=== GANHOU ===");
                    printMatrizStr(galo);
                    return true;
                }
                if (filler.equals(" O ")){
                    cleanConsole();
                    System.out.println("===== Jogo do Galo =====\n");
                    System.out.println("\nO - Jogador 2\n=== GANHOU ===");
                    printMatrizStr(galo);
                    return true;
                }
            }
            y++;
        }

        if (galo[0][0].equals(filler) && galo[1][1].equals(filler) && galo[2][2].equals(filler)){
            if (filler.equals(" X ")){
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                System.out.println("\nX - Jogador 1\n=== GANHOU ===");
                printMatrizStr(galo);
                return true;
            }
            if (filler.equals(" O ")){
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                System.out.println("\nO - Jogador 2\n=== GANHOU ===");
                printMatrizStr(galo);
                return true;
            }
        }

        if (galo[2][0].equals(filler) && galo[1][1].equals(filler) && galo[0][2].equals(filler)){
            if (filler.equals(" X ")){
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                System.out.println("\nX - Jogador 1\n=== GANHOU ===");
                printMatrizStr(galo);
                return true;
            }
            if (filler.equals(" O ")){
                cleanConsole();
                System.out.println("===== Jogo do Galo =====\n");
                System.out.println("\nO - Jogador 2\n=== GANHOU ===");
                printMatrizStr(galo);
                return true;
            }
        }

        return false;
    }

    public static boolean toTie(String[][] galo, String filler){
        int y, x = 0;

        while (x < galo.length) {
            y = 0;
            while (y <  galo[0].length){
                if (galo[x][y].equals(filler))
                    return false;
                y++;
            }
            x++;
        }
        cleanConsole();
        System.out.println("===== Jogo do Galo =====\n");
        System.out.println("\n=== EMPATE ===\n\n");
        printMatrizStr(galo);
        return true;
    }
}
















