package br.edu.ifpb.state.payment_Ecommerce.repository;

import br.edu.ifpb.state.payment_Ecommerce.model.UsuarioPayPal;

import java.util.ArrayList;
import java.util.List;

public class UsuarioPayPalRepository {
    private List<UsuarioPayPal> lista;

    public UsuarioPayPalRepository() {
        lista = new ArrayList<UsuarioPayPal>();
        lista.add(new UsuarioPayPal("teste1@teste", "123"));
        lista.add(new UsuarioPayPal("teste2@teste", "321"));
        lista.add(new UsuarioPayPal("teste3@teste", "213"));
    }

    public List<UsuarioPayPal> getUsers() {
        return lista;
    }
}
