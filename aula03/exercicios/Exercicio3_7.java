package exercicios;
import java.util.Scanner;
public class Exercicio3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media1, media2, soma1, soma2;
        int c1, c2, aluno;
        c1 = 1;
        soma2 = 0;
        aluno = 20;
        while(c1 <= 5) {
            c2 = 1;
            soma1 =0;
            while(c2 <= aluno) {
                media1 = in.nextDouble();
                soma1 = soma1 + media1;
                c2++;
            }
            media2 = soma1 / aluno;
            System.out.println("A media da turma " + c1 + " é:" + media2);
            soma2 = soma2 + media2;
            c1++;
        }
        System.out.println("A media de todas as turmas é: " + (double)(soma2 / 5) );
        in.close();
    }
}
