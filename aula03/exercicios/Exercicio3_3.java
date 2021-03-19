package exercicios;
import java.util.Scanner;
public class Exercicio3_3 {
    public static void main(String[] args) {
        int i, num;
        Scanner in = new Scanner(System.in);

        num = in.nextInt();
        i = 1;
        while(i <= num) {
            System.out.printf("%d" , i);
            i *= 2;
            if (i <= num) {
            System.out.printf(",");
            }
        }
        in.close();
    }
}
