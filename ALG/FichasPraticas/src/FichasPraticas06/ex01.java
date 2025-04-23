package FichasPraticas06;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animal;

        System.out.print("> Insira um animal -> ");
        animal = input.nextLine();
        fazerBarulho(animal);
    }
    public static void fazerBarulho(String animal){
        animal=animal.toLowerCase();
        switch (animal){
            case "cao":
                System.out.print("- Au au  au ");
                break;
            case "gato":
                System.out.print("- Miau ");
                break;
            case "peixe":
                System.out.print("- “Glub  Glub ");
                break;
            case "vaca":
                System.out.print("- Muuuu ");
                break;
            case "porco":
                System.out.print("- Oinc oinc ");
                break;
            default:
                System.out.print("- Animal nao reconhecido! ");
                break;
        }
    }
}
