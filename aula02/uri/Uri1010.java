package uri;
import java.io.IOException;
import java.util.Scanner;
 
public class Uri1010 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        float preco1, preco2, total;
        entrada.nextInt();
        n1 = entrada.nextInt();
        preco1 = entrada.nextFloat();
        entrada.nextInt();
        n2 = entrada.nextInt();
        preco2 = entrada.nextFloat();
        
        total = (n1 * preco1)  + (n2 * preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
        entrada.close();     
      
    }
 }