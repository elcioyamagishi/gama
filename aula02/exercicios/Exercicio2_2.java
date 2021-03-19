package exercicios;

import java.util.Scanner;

public class Exercicio2_2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double n1, n2, media;
        System.out.println("Digite as notas ");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        media = ((n1 * 4) + (n2 * 6)) / 10  ;
        if ( media >= 6 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        teclado.close();

    }
}
