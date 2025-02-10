package br.edu.ifpb.state.payment_Ecommerce.repository;

import br.edu.ifpb.state.payment_Ecommerce.model.Cartao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CartaoRepository {
    List<Cartao> lista;

    public CartaoRepository() {
        lista = new ArrayList<>();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            lista.add(new Cartao("123456789", "10/25", "955"));
            lista.add(new Cartao("987654321", "01/25", "270"));
            lista.add(new Cartao("153575950", "12/25", "188"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Cartao> getCartoes(){
        return this.lista;
    }

    public boolean findCartao(Cartao cartao){
        return lista.contains(cartao);
    }
}
