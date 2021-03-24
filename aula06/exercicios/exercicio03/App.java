package exercicios.exercicio03;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1001);
        ContaEspecial ce = new ContaEspecial(1002,1000);
        ContaPoupanca cp = new ContaPoupanca(1003);

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1- nova conta corrente");
            System.out.println("2- nova conta especial");
            System.out.println("3- nova conta poupanca");
            System.out.println("4- Deposito");
            System.out.println("5- Saque");
            System.out.println("6- Consultar Saldo");
            System.out.println("7- Sair");
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
        }
        while( opcao != 7) ;


        System.out.println("\nConta Corrente\n" + cc);
        cc.deposito(100);
        System.out.println(cc);
        cc.saque(50);
        System.out.println(cc.getSaldo());
        if (cc.saque(500)) {
            System.out.println("Novo Saldo: " + cc.getSaldo());
        } else {
            System.out.println("Operacao Negada");
        }

        System.out.println("\nConta Especial\n" + ce);
        ce.deposito(100);
        System.out.println(ce);
        ce.saque(50);
        System.out.println(ce);
        if (ce.saque(500)) {
            System.out.println("Novo Saldo: " + ce.getSaldo());
        } else {
            System.out.println("Operacao Negada");
        }
    
        System.out.println("\nConta Poupanca\n" + cp);
        cp.deposito(100);
        System.out.println(cp);
        cp.saque(50);
        System.out.println(cp);
        ContaPoupanca.setTaxa(2);
        if (cp.saque(30)) {
            System.out.println("Novo Saldo: " + cp.getSaldo());
        } else {
            System.out.println("Operacao Negada");
        }
    
    }
}