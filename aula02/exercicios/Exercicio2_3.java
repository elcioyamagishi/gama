package exercicios;
import java.util.Scanner;
// Le dois numeros floats e imprime em ordem nao crescente
public class Exercicio2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float v1, v2;
        v1 = input.nextFloat();
        v2 = input.nextFloat();
        if( v1 > v2) {
            System.out.println(v1);
            System.out.println(v2);

        } else {
            System.out.println(v2);
            System.out.println(v1);
        }
        input.close();
    }
}
