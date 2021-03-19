package exercicios;
import java.util.Scanner;

public class Exercicio2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os lados do triangulo: ");
        int a, b, c;
        String tipo;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if( (a > b + c) || ( b > a + c ) || ( c > a + b)){
            System.out.println("Nao é um triangulo");
        } else {
            if (( a == b) && (b == c)) {
                tipo = "equilatero";
            } else {
                if( (a == b) || ( b == c) || (a == c)){ 
                    tipo = "isosceles";
                } else {
                    tipo = "escaleno";
                }
            }
        
        System.out.println("O triangulo é : " + tipo);
        }
        input.close();
    }
    
}
