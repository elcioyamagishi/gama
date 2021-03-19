package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float num, soma;
        int  positivo;
        positivo = 0;
        soma = 0;
        for (int i=0;i<6;i++) {
            num = input.nextFloat();
            if(num > 0) {
                positivo++;
                soma = soma + num;
            }
        }        
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", (soma / positivo));
        input.close();
    }
    
}
