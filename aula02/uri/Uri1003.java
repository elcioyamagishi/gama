package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int vlr1, vlr2, soma;
        vlr1 = entrada.nextInt();
        vlr2 = entrada.nextInt();
        soma = vlr1 + vlr2;
        System.out.println("SOMA = " + soma );
        entrada.close();     
    }
}
