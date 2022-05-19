package br.dio.poo;

public abstract class Conta extends Iconta {

    private static int agenciaPadrão;
    private static int Sequencial = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta(){
       this.agencia = Conta.agenciaPadrão;
       this.numero = Sequencial++ ;}



    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }


    public void  depositar(){
    }

    public void  transferir(){
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo(){
        return saldo;}
    protected void imprimirInfoscomuns() {
        System.out.println(String.format("conta %d ", this.agencia));
        System.out.println(String.format("numero %d ", this.numero));
        System.out.println(String.format("saldo %2f ", this.saldo));
    }
}

