package FichasPraticas06;

public class ex05 {
    static int maior(int[ ] vetor){
        int i = 0, maior;
        maior = vetor[0];

        while (i < vetor.length){
            if (maior < vetor[i])
                maior = vetor[i];
            i++;
        }
        return maior;
    }

    static int menor(int[ ] vetor){
        int i = 0, menor;
        menor = vetor[0];

        while (i < vetor.length){
            if (menor > vetor[i])
                menor = vetor[i];
            i++;
        }
        return menor;
    }
    static boolean crescente(int[ ] vetor){
        int i = 0;
        while (i < (vetor.length - 1)){
            if (vetor[i] > vetor[i+1])
                return false;
            i++;
        }
        return true;
    }
}
