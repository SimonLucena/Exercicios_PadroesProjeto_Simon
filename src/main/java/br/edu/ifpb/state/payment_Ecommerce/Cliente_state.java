package br.edu.ifpb.state.payment_Ecommerce;

import br.edu.ifpb.state.payment_Ecommerce.model.ProcessPedido;

import java.io.IOException;

/**
 * World first console e-commerce application.
 */
public class Cliente_state {
    public static void main(String[] args) throws IOException {
        ProcessPedido pedido = new ProcessPedido();
        pedido.iniciarOperacao();
    }
}
