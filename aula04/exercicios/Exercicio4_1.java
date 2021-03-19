package exercicios;

public class Exercicio4_1 {
    public static void main(String[] args) {
        System.out.println(par(11));
    }
    static String par(int num){
        if(num % 2 == 0){
            return "par";
        } else {
            return "impar";
        }
    }
    
}
