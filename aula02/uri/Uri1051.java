package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1051{

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float sal, tax;

        sal = in.nextFloat();

        if(sal <= 2000) {
            System.out.println("Isento");
        } else{
            if(sal <=3000) {
                tax = (float)((sal - 2000) * 0.08);
            } else {
                if(sal <=4500) {
                    tax = (float)(80 + (sal - 3000) * .18); 
                } else{
                    tax = (float)(80 + 270 + (sal - 4500) * .28);
                }
            }
            System.out.printf("R$ %.2f\n", tax);
        }
        in.close();
    }
}
