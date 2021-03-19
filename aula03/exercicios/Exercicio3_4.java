package exercicios;
import java.util.Scanner;

public class Exercicio3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont, soma;
        num = 1;
        soma = 0;
        cont = 1;
        while( num != 0) {
            System.out.print("Digite o " + cont + "o numero: ");
            num = in.nextInt();
            soma = soma + num;
            cont++;
        }
        in.close();
        System.out.println("A doma dos valores é: " + soma);
    }
}
