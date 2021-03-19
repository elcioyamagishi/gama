package uri;
import java.io.IOException;
import java.util.Scanner;
 
public class Uri1006 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        float vlr1, vlr2, vlr3, media;
        vlr1 = entrada.nextFloat();
        vlr2 = entrada.nextFloat();
        vlr3 = entrada.nextFloat();
        media = (vlr1 * 2 + vlr2 * 3  + vlr3 * 5 ) / 10;
        System.out.printf("MEDIA = , %.1f \n" , media);
        entrada.close();     
        
    }
 
}