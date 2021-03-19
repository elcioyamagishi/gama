package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        String e, a;
        e = "Emerson";
        a = "Amanda";
        Pessoa p = new Pessoa(e); // instanciacao
        Pessoa p2 = new Pessoa(a);

        // p.nome = "Emerson"
        p.apresentar();

        p2.apresentar();
    }
}
