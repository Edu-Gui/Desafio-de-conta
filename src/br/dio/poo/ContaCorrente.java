package br.dio.poo;

public class ContaCorrente extends Conta{

      @Override
      public void imprimirExtrato() {
         System.out.println("extrato da conta corrente " );
         super.imprimirInfoscomuns();

      }
   }





