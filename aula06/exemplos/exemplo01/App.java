package exemplos.exemplo01;

public class App{


    public static void main(String[] args) {
        //Funcionario f2 = new Funcionario();
        Funcionario f = new Funcionario("Fernando", 2000);
        Gerente g = new Gerente("Amanda", 3000, 10);
        
        f.calculaNovoSalario(10);
        g.calculaNovoSalario(10);
        
        System.out.println(f.exibir());    
        System.out.println(g.exibir());   
    }
}
