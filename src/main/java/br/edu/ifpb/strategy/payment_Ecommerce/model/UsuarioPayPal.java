package br.edu.ifpb.strategy.payment_Ecommerce.model;

public class UsuarioPayPal {
    public String email;
    public String senha;

    public UsuarioPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
