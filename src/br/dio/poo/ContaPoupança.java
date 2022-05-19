package br.dio.poo;

public class ContaPoupança extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("extrato da conta poupança " );
        super.imprimirInfoscomuns();

    }


}
