package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar("Santos","Pameiras");
        Placar p2 = new Placar("Sao Paulo","Pameiras",2,3);
        Placar p3 = new Placar("Santos","Sao Paulo",2,2);

        p1.exibir();
        p2.exibir();
        p3.exibir();
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p1.getClass());
    }
    
}
