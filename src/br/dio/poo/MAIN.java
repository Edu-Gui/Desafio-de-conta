package br.dio.poo;

public class MAIN {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupança = new ContaPoupança();

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
