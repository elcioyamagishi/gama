package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float n1, n2, media;
        boolean n1Ok, n2Ok;
        n1Ok = false;
        n2Ok = false;
        n1 = -1;
        n2 = -1;
        while( ! n1Ok ) {
            n1 = in.nextFloat();
            if((n1 <0 ) || (n1 > 10)){
                System.out.println("nota invalida");
            } else {
                n1Ok = true;
            }
        }
        while( ! n2Ok ) {
            n2 = in.nextFloat();
            if((n2 <0 ) || (n2 > 10)){
                System.out.println("nota invalida");
            } else {
                n2Ok = true;
            }
        }
               media = (n1 + n2) / 2;
        System.out.printf("media = %.2f\n", media);
        in.close();
    }
}
