package exercicios;

    import java.util.Scanner;

public class Exercicio1_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valorFabrica, valorImpostos, valorDistribuidor, valorFinal;
        System.out.println("Digite o valor de Fabrica : ");
        valorFabrica = entrada.nextDouble();
        valorImpostos = valorFabrica * 0.28;
        valorDistribuidor = valorFabrica * 0.45;
        valorFinal = valorFabrica+ valorImpostos + valorDistribuidor;
        System.out.printf("Valor de fabrica   : %.2f \n" , valorFabrica);
        System.out.printf("Valor Impostos     : %.2f \n" , valorImpostos);
        System.out.printf("Valor Distribuidor : %.2f \n" , valorDistribuidor);
        System.out.printf("Valor Final        : %.2f \n" , valorFinal);
        entrada.close();
    }
    
}
