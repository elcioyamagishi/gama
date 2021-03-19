package exercicios;
import java.util.Scanner;

public class Exercicio3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, par, soma;
        par = 0;
        soma = 0;
        for(int i=1;i<11;i++){
            System.out.print("Digite o " + i + "o numero: ");
            num = in.nextInt();
            if(num % 2 == 0) {
                par++;
                soma = soma + num;
            }
        }
        System.out.println("A media dos numeros pares é   : " + ( soma / par));
        System.out.println("O % de numeros impares é : " + ((10 - par) * 10) + "%");
        in.close();
    }
}
