package br.edu.ifpb.strategy.payment_Ecommerce;

import br.edu.ifpb.strategy.payment_Ecommerce.model.ProcessPedido;

import java.io.IOException;

/**
 * World first console e-commerce application.
 */
public class Cliente_strategy {
    public static void main(String[] args) throws IOException {
        ProcessPedido pedido = new ProcessPedido();
        pedido.iniciarOperacao();
    }
}
