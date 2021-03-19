package exercicios.exercicio03;

public class Veiculo {
    
    // Atributos
    String modelo, marca;
    double consumo;

    // construtor
    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // metodos
    void exibir() {
        System.out.println("Modelo: " + modelo + " Marca: " + marca);
    }

    double obterConsumo() {
        return consumo;
    }



}
