package exercicios;

import java.util.Scanner;

public class Exercicio3_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, par, impar;
        par = 0;
        impar = 0;
        for (int i = 1; i < 11; i++) {
            System.out.print("Digite o " + i + "o numero: ");
            num = entrada.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("O total de pares é   : " + par);
        System.out.println("O total de impares é : " + impar);
        entrada.close();
    }
}
