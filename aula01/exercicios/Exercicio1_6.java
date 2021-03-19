package exercicios;

import java.util.Scanner;

public class Exercicio1_6 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double km, milha, jarda, pe, polegada;
        System.out.println("Digite a distancia em km: ");
        km = entrada.nextDouble();
        milha = km * 0.62137;
        jarda = milha * 1760;
        pe = jarda * 3;
        polegada = pe * 12;
        System.out.printf("Distancia em km         : %.2f\n", km);
        System.out.printf("Distancia em milhas     : %.2f\n", milha);
        System.out.printf("Distancia em jardas     : %.2f\n", jarda);
        System.out.printf("Distancia em pes        : %.2f\n", pe);
        System.out.printf("Distancia em polegadass : %.2f\n", polegada);

        entrada.close();

    }
     
}
