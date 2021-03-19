package exercicios;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        System.out.print("Ola mundo!");
        System.out.println("Primeiro \n Programa"); // \n  quebra de filha
        System.out.println( "2 + 3");
        System.out.println( 2 + 3);
        System.out.println("Resposta = " + 2 + 3); // o java interpreta da esq para direita, como ele acha que é texto, faz o concat
        System.out.println("Resposta = " + (2 + 3)); // () altera a prioridade de execucao
    }
}
