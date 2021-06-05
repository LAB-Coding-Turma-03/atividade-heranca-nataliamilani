package br.com.impacta.lab;

public abstract class Conta {

    /*
    * Crie três classes nesse mesmo pacote todas obedecendo o 
    * pilar de encapsulamento
    * 
    * 1 - Conta
    * Atributo		tipo do atributo
    * numero		int
    * agencia		int
    * tipo			String
    * 
    * Construtor - 
    * Um construtor para preencher todos os atributos no
    * momento de instancia o objeto
    * 
    * método - 
    * public String montarResumoDaConta()
    * 
    * que retorne o resumo da conta nesse formato
    * "Numero: " + this.getNumero() + 
        " - Agencia: " + this.getAgencia() +
        " - Tipo: " + this.getTipo();
    * 
    */


    private int numero;
    private int agencia;
    private String tipo;

    public Conta (int numero, int agencia, String tipo){
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    public String montarResumoDaConta(){
        return "Numero: " + this.getNumero() + 
                " - Agencia: " + this.getAgencia() +
                " - Tipo: " + this.getTipo();
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}