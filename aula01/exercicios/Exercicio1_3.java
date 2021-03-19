package exercicios;

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        System.out.println("Digite o salario atual: ");
        Scanner entrada = new Scanner(System.in);
        double sal1, sal2;
        sal1 = entrada.nextInt();

        sal2 = sal1 * 1.25;    
        System.out.println("O novo salario apos aumento de 25% é: " + sal2);

        entrada.close();
    }
    
    
}
