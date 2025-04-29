package FichasExtra.Ciclos;

public class ex05 {
    public static void main(String[] args) {
        programa1();
        programa2();
        programa3();
    }
    public static void programa1() {
        int x = 1;
        for (int l = 0; l < 4; l++) {
            int i = -1;
            while (i < l) {
                System.out.print(x);
                i++;
                if (i < l)
                    System.out.print(" ");
            }
            x++;
            System.out.println();
        }
        System.out.print("...");
        System.out.println("\n");
    }
    public static void programa2(){
        int spacein = 3, rep = 1, temp, x = 1;

        for (int l = 5; l >= 0; l--){
            if (0 < l){
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
                    System.out.print(x);
                    temp--;
                }
                System.out.println();
                rep += 2;
            }
            x++;
        }
        System.out.println();
    }

    public static void programa3(){
        int spacein = 3, qntnum = 1, temp, x = 1;

        for (int l = 5; l >= 0; l--){
            if (0 < l){
                int spacenext = 0;
                while (spacein >= 0){
                    System.out.print(" ");
                    spacein--;
                    spacenext++;
                }
                spacenext -= 2;
                spacein = spacenext;
                temp = qntnum;
                while (temp > 0){
                    while (x > 1){
                        System.out.print(x);
                        x--;
                        temp--;
                    }
                    System.out.print(x);
                    temp--;
                    x++;
                    while (x < qntnum && temp > 0){
                        System.out.print(x);
                        x++;
                        temp--;
                    }
                }
                System.out.println();
                qntnum += 2;
            }
        }
        System.out.println();
    }

}
