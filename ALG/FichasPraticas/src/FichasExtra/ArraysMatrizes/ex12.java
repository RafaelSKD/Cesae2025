package FichasExtra.ArraysMatrizes;

import Header.num;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;

public class ex12 {
    public static void main(String[] args) {
        int[] array1 = new int[8];
        int[] array2 = new int[8];

        System.out.println("\n- Preencha o array1");
        fillArray(array1);
        System.out.println("\n- Preencha o array2");
        fillArray(array2);

        int tam;

        tam = countSingleNumbers(array1, array2);
        int[] array3 = new int[tam];
        fillNewArray(array1, array2, array3);
        System.out.println("\n- Array 3:");
        printArray(array3);
    }

    public static int countSingleNumbers(int[] array1, int[] array2) {
        int i = 0, k, num, count = 0, flag = 0;


        while (i < array1.length){ // verificar nums se repetem array 1

            num = array1[i];
            k = 0;

            while (k < i){  // verificar se num já apareceu antes no array1
                if (num == array1[k]){
                    flag = 1;
                    break;
                }
                k++;
            }

            if (flag == 0){  // ler no array 2 se nao encontrou no array 1
                k = i + 1;
                while (k < array1.length){
                    if (num == array1[k]){
                        flag = 1;
                        break;
                    }
                    k++;
                }
            }

            if (flag == 0) { // se não se repetiu no array1, verificar se aparece no array2
                k = 0;
                while (k < array2.length) {
                    if (num == array2[k]) {
                        flag = 1;
                        break;
                    }
                    k++;
                }
            }

            if (flag == 0)
                count++; // se nao acionou a flag quer dizer que nao aparece mais

            i++;  // next
        }

        i = 0;
        while (i < array2.length){  // verificar se num já apareceu antes no array2
            num = array2[i];
            k = 0;
            flag = 0;

            while (k < i){
                if (num == array2[k]){
                    flag = 1;
                    break;
                }
                k++;
            }

            if (flag == 0) { // verificar se num se repete mais à frente no array2
                k = i + 1;
                while (k < array2.length) {
                    if (num == array2[k]) {
                        flag = 1;
                        break;
                    }
                    k++;
                }
            }

            if (flag == 0)
                count++;

            i++;
        }
        return count;
    }

    public static void fillNewArray(int[] array1, int[] array2, int[] array3){
        int i = 0, k, num, flag = 0, index = 0;


        while (i < array1.length){  // verificar nums se repetem array 1
            num = array1[i];
            k = i + 1;  // verifica o que esta a frente
            while (k < array1.length){  // ler no array 1
                if (num == array1[k]){
                    flag = 1;
                    break;
                }
                k++;
            }
            if (flag == 0){  // ler no array 2 se nao encontrou no array 1
                k = 0;
                while (k < array2.length){
                    if (num == array2[k])
                        break;
                    k++;
                }
                k--; // para voltar ao verificado acima
                array3[index] = num; // se nao encontrou em lado a frente dele quer dizer que e o ultimo
                index++;
            }
            i++;  // next
        }
        i = 0;
        while (i < array2.length){  // verificar nums array 2
            num = array2[i];
            k = i + 1; // verifica o que esta a frente
            while (k < array2.length){
                if (num == array2[k])
                    break;
                k++;
            }
            k--; // para voltar ao verificado acima
            array3[index] = num; // se nao encontrou em lado a frente dele quer dizer que e o ultimo
            index++;
            i++;  // next
        }
        array3[index] = array2[array2.length - 1]; // o ultimo numero nao tem nenum a frente
    }
}

