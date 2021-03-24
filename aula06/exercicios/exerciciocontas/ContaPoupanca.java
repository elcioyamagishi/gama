package exercicios.exercicio03;

public class ContaPoupanca extends Conta {
    private static double taxaSaque = 1;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if( getSaldo() >= valor) {
            super.saque( valor + taxaSaque );
            return true;
        }
        return false;
    }

    public static void setTaxa(double novaTaxaSaque) {
        if (taxaSaque > 0 ) {
            taxaSaque = novaTaxaSaque;
        }
    }


}
