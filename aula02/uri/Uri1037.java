package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float num;

        num = in.nextFloat();

        if(( num < 0) || (num > 100)) {
            System.out.println("Fora de intervalo");
        } else {
            if( num <= 25) {
                System.out.println("Intervalo [0,25]");
            } else {
                if( num <= 50) {
                    System.out.println("Intervalo (25,50]");
                } else {
                    if( num <= 75) {
                        System.out.println("Intervalo (50,75]");
                    } else {
                        System.out.println("Intervalo (75,100]");    
                    }
                }
            }
        }
        in.close();

    }
    
}
