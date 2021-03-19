package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;

    // metodos - acao, comportamento
    void apresentar() {
        System.out.println("Ola! Eu sou " + nome);
    }
    
    // construtor
    Pessoa(String nome){
            this.nome = nome; // this = o proprio objeto criado nos atributos
    }
}