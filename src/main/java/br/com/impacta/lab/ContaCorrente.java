package br.com.impacta.lab;

public class ContaCorrente extends Conta {

    /* 2-
    * ContaCorrente que estenda de Conta
    * 
    * Construtor - 
    * Construtor que receba todos os atributos de entrada e 
    * passe para a superclasse (Conta)
    */

    public ContaCorrente (int numero, int agencia, String tipo){

        super(numero, agencia, tipo);
    }

}