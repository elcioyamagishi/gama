package exercicios;
import java.util.Scanner;

public class Exercicio2_5 {
    
    public static void main(String[] args){
        System.out.println("Digite a Senha :");
        Scanner input = new Scanner(System.in);
        String senha = input.nextLine();
        final String SENHA = "R10p5";
        if( senha.equals(SENHA)) {
        // poderia ser senha.equalsIgnorecase 
            System.out.println("acesso concedido");;
        } else {
            System.out.println("acesso negado");
        }
        input.close();
    }
    
}
