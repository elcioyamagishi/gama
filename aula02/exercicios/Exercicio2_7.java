package exercicios;
import java.util.Scanner;

public class Exercicio2_7 {
    public static void main(String[] args) {
        // < =  600 - isento
        // > 600 e <= 1200 - 20%
        // > 1200 e <= 2000 - 25%
        // > 2000 - 30%
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Salario: ");
        int salario, desconto;
        salario = input.nextInt();
        if(salario > 2000) {
            desconto = 30;
        } else{
            if(salario > 1200) {
                desconto = 25;
            } else {
                if(salario > 600) {
                    desconto = 20;
                } else {
                    desconto = 0;
                }
            }
        }
        System.out.printf("O desconto é: %d\n", desconto );
        input.close();

    }
    
}
