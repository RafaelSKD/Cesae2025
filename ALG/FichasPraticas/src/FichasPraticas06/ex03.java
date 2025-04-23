package FichasPraticas06;

public class ex03 {
    static boolean par(int num){
        if (num % 2 == 0)
            return true;
        return false;
    }

    static boolean positivo(int num){
        if (num >= 0)
            return true;
        return false;
    }

    static boolean primo(int num){
        int i = 2;

        while (i < num){
            if (num % i == 0)
                return false;
            i++;
        }
        return true;
    }

    static boolean perfeito(int num){
        int i = 1, soma = 0;

        while (i < num){
            if (num % i == 0){
                soma += i;
            }
            i++;
        }
        if (soma == num)
            return true;
        return false;
    }

    static boolean triangular(int num){
        int i = 1, soma = 0;

        while (soma < num){
            soma += i;
            i++;
        }
        if (soma == num)
            return true;
        return false;
    }
}
