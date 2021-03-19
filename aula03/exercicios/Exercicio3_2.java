package exercicios;
import java.util.Scanner;
public class Exercicio3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor : ");
        int cont, num; 
        cont = 0;

        num = in.nextInt();

        while ( cont <= 10) {
            System.out.printf("%d x %2d = %2d\n", num , cont ,  (num * cont));
            cont++;
        }
        in.close();

    }
}
