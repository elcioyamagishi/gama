package exercicios;

import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double salario, kw, valor, valorDesconto;
        int consumoKw;
        System.out.println("Digite o valor do salario minimo: ");
        salario = entrada.nextInt();
        System.out.println("Digite o consumo de KW: ");
        consumoKw = entrada.nextInt();
        kw = salario / 500;
        valor = consumoKw * kw;
        valorDesconto = valor * .85;
        
        System.out.println("O valor a ser pago é  : " + valor);
        System.out.println("O valor com desconto é: " + valorDesconto);
        entrada.close();
    }
    
}
