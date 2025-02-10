package br.edu.ifpb.strategy.payment_Ecommerce.model;

public class Cartao {
    public String numero;
    public String expiracao;
    public String cvv;

    public Cartao(String numero, String expiracao, String cvv) {
        this.numero = numero;
        this.expiracao = expiracao;
        this.cvv = cvv;
    }
}