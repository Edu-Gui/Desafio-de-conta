package br.dio.poo;

public abstract class Iconta {
     abstract void  sacar(double valor);

     abstract void  depositar(double valor);

     abstract void  transferir(double valor, Conta contaDestino);

     public void imprimirExtrato() {

     }
}

