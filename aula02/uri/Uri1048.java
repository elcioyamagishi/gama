package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Float sal, novosal, reaj;
        int perc;
        sal = in.nextFloat();
        if(sal <= 400) { 
            perc = 15;
            reaj = (float)(sal * perc / 100);
        } else { 
            if(sal <= 800) { 
                perc = 12;
                reaj = (float)(sal * perc / 100);
            } else{ 
                if(sal <= 1200) { 
                    perc = 10;
                    reaj = (float)(sal * perc / 100);
                } else{ 
                    if(sal <= 2000) { 
                        perc = 7;
                        reaj = (float)(sal * perc / 100);
                    } else{ 
                            perc = 4;
                            reaj = (float)(sal * perc / 100);
                        }
                    }
                }
            }
          



        novosal = sal + reaj;    
        System.out.printf("Novo salario: %.2f\n", novosal );
        System.out.printf("Reajuste ganho: %.2f\n", reaj );
        System.out.println("Em percentual : " + perc + " %" );
        in.close();



    }    
}
