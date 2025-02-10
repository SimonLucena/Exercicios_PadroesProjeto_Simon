package br.edu.ifpb.state.payment_Ecommerce.strategy;

import br.edu.ifpb.state.payment_Ecommerce.model.Pedido;

public interface PagamentoStrategy {
    boolean pagar(Pedido pedido);
    default void imprimir(Pedido pedido){
        System.out.println("Compra no valor de "+pedido.getValor()+" realizado com sucesso!");
        System.out.println("Volte sempre!!\n\n\n");
        pedido.closeProcess();
    }
}
