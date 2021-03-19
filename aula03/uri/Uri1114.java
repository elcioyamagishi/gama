package uri;
import java.io.IOException;
import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        boolean passOk;
        String senha, digitado;
        senha = "2002";
        passOk = false;
        while( ! passOk) {
            digitado = in.nextLine();
            if(digitado.equals(senha)){
                passOk = true;
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }
        in.close();
    }
}
