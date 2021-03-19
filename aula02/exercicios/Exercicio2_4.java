package exercicios;
import java.util.Scanner;

public class Exercicio2_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Salario e o valor da prestaçao:");
        double salario, prest;
        salario = input.nextDouble();
        prest = input.nextDouble();
        if ( prest < (salario * 0.3)) {
            System.out.println("Emprestimo concedido");
        } else {
            System.out.println("Emprestimo negado");
        }
        input.close();
    }
}
