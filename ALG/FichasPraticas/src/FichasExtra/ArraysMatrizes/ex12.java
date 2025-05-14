package FichasExtra.ArraysMatrizes;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;

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


        while (i < array1.length) {
            num = array1[i];
            flag = 0;
            k = i + 1;// Verificar no array1 so para a frente

            while (k < array1.length) {
                if (num == array1[k]) {
                    flag = 1;
                    break;
                }
                k++;
            }

            // Se não encontrar verificar no array2
            if (flag == 0) {
                k = 0;
                while (k < array2.length) {
                    if (num == array2[k]) {
                        flag = 1;
                        break;
                    }
                    k++;
                }
            }
            // Se não aparece em lugar nenhum, contar
            if (flag == 0) {
                count++;
            }
            i++;
        }

        i = 0;
        while (i < array2.length) {
            num = array2[i];
            flag = 0;
            k = i + 1;// Verificar no array2 so para a frente

            while (k < array2.length) {
                if (num == array2[k]) {
                    flag = 1;
                    break;
                }
                k++;
            }
            // Se não aparece em lugar nenhum, contar
            if (flag == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void fillNewArray(int[] array1, int[] array2, int[] array3) {
        int i = 0, k, num, index = 0, flag = 0;


        while (i < array1.length) {
            num = array1[i];
            flag = 0;
            k = i + 1;// Verificar no array1 so para a frente

            while (k < array1.length) {
                if (num == array1[k]) {
                    flag = 1;
                    break;
                }
                k++;
            }

            // Se não encontrar verificar no array2
            if (flag == 0) {
                k = 0;
                while (k < array2.length) {
                    if (num == array2[k]) {
                        flag = 1;
                        break;
                    }
                    k++;
                }
            }
            // Se não aparece em lugar nenhum, adicionar
            if (flag == 0) {
                array3[index] = num;
                index++;
            }
            i++;
        }

        i = 0;
        while (i < array2.length) {
            num = array2[i];
            flag = 0;
            k = i + 1;// Verificar no array2 so para a frente

            while (k < array2.length) {
                if (num == array2[k]) {
                    flag = 1;
                    break;
                }
                k++;
            }
            // Se não aparece em lugar nenhum, adicionar
            if (flag == 0) {
                array3[index] = num;
                index++;
            }
            i++;
        }
    }
}
