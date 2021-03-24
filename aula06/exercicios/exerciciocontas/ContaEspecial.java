package exercicios.exercicio03;

public class ContaEspecial extends Conta {
    double limite;
    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        System.out.println(getSaldo());
        if ( getSaldo() + limite >= valor) {
            super.saque(valor);
            return true;
        }
        return false;
    }
    
}
