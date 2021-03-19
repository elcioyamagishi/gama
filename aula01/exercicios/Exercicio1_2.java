package exercicios;

import java.util.Scanner;

public class Exercicio1_2 {


    public static void main(String[] args) {
        System.out.println("Digite o primeiro numero: ");
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        
        numero2 = entrada.nextInt();

        System.out.println("Media dos numeros " + numero1 + " e " + numero2 + " é: " + ((numero1 + numero2) / 2));

        entrada.close();
    }
    
}
