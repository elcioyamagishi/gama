package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Fusca", "VW", 15);

        v.exibir();
        System.out.println("Consumo: " + v.obterConsumo());
    }
    
}
