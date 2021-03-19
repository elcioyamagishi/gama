package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num, par, impar, posi, nega;
        par = 0;
        impar = 0;
        posi = 0;
        nega = 0;
        for(int i=0;i<5;i++) {
            num = in.nextInt();
            if(num > 0) {
                posi++;;
            } 
            if(num <0) { 
                nega++;;
            }
            if(num % 2 == 0) {
                par++;;
            } else {
                impar++;;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(posi + " valor(es) positivo(s)");
        System.out.println(nega + " valor(es) negativo(s)");
        in.close();
    }
}
