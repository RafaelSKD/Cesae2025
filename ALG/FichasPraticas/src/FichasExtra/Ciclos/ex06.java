package FichasExtra.Ciclos;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, maior = 0, menor = 0, num = 0, flag = 0, complete = 0;

        while (true){
            while (complete != 1){
                System.out.print("> Insira um número: ");
                i = input.nextInt();
                if (i == 0)
                    System.out.print("ERROR - Sem numeros suficientes\n");
                else if (flag == 0){
                    num = i;
                    flag = 1;
                }
                else if (flag == 1){
                    if (i > num){
                        maior = i;
                        menor = num;
                        complete = 1;
                    }
                    else{
                        maior = num;
                        menor = i;
                        complete = 1;
                    }
                }
            }
            System.out.print("> Insira um número: ");
            i = input.nextInt();
            if (i == 0){
                System.out.println("> Maior número: " + maior);
                System.out.println("> Menor número: " + menor);
                break;
            }
            else{
                if (i < menor)
                    menor = i;
                else if (i > maior) {
                    maior = i;
                }
            }
        }
    }
}
