package FichasExtra.Ciclos;

public class ex04 {
    public static void main(String[] args) {
        char c ='*';

        programa1(c);
        programa2(c);
        programa3(c);
    }
    public static void programa1(char c){
        for (int l = 0; l < 4; l++){
            int i = 0;
            while (i < 10){
                System.out.print(c);
                i++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void programa2(char c) {
        for (int l = 0; l < 5; l++) {
            int i = -1;
            while (i < l) {
                System.out.print(c);
                i++;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void programa3(char c){
        int spacein = 3, rep = 1, temp;

        for (int l = 6; l >= 0; l--){
            int i = 1;
            if (i < l){
                int spacenext = 0;
                while (spacein >= 0){
                    System.out.print(" ");
                    spacein--;
                    spacenext++;
                }
                spacenext -= 2;
                spacein = spacenext;
                temp = rep;
                while (temp > 0){
                    System.out.print(c);
                    temp--;
                }
                System.out.println();
                rep += 2;
            }
            i++;
        }
        System.out.println();
    }

}

