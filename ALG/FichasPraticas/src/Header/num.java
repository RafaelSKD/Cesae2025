package Header;

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
}
