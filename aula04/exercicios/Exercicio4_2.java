package exercicios;

public class Exercicio4_2 {
    public static void main(String[] args) {
        System.out.println(menor(5,4,2));
    }

    static int menor(int a, int b, int c) {
        int m;
        m = 0;
        if((a < b) && (a < c)){
           m = a;
        } else { 
            if((b < a) && (b < c)) {
                m = b;
            } else {
                if ((c < a) && (c< b)) {
                    m = c;
                }
            }
        }
        return m;
    }

}
