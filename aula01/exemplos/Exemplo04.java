package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro: ");
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = entrada.nextInt();
        System.out.println("voce digitou " + numero);

        entrada.close();
    }
    
}
