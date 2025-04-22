package FichasPraticas03;

public class ex07 {
    public static void main(String[] args){

        int numero, soma;

        numero = 0;
        soma = 0;

        while (numero < 100) {
            soma = soma + numero;
            numero++;
            System.out.println("- " + numero);
        }
        System.out.println("- Somatorio: " + soma);
    }
}
