package Header;

import java.util.Scanner;

import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
public class num {
    public static boolean isParZero(int    num){
        if (num == 0)
            return true;
        if (num % 2 == 0)
            return true;
        return false;
    }

    public static boolean isPar(int    num){
        if (num % 2 == 0)
            return true;
        return false;
    }

    public static boolean isImpar(int    num){
        if (num == 0)
            return false;
        if (num % 2 == 0)
            return false;
        return true;
    }

    public static boolean isPositive(int    num){
        if (num > 0)
            return true;
        return false;
    }

    public static boolean isPositiveZero(int    num){
        if (num >= 0)
            return true;
        return false;
    }

    public static boolean isNegative(int    num){
        if (num < 0)
            return true;
        return false;
    }

    public static int countNumbers(int num) {
        int count = 0;

        if (num == 0)
            return 1;
        if (num < 0){
            num = -num;
            count++;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
