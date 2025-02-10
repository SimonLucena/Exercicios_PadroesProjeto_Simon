package br.edu.ifpb.strategy.payment_Ecommerce.strategy;

public interface PagamentoStrategy {
    boolean pagar(double valor);
    default void imprimir(double valor){
        System.out.println("Compra no valor de "+valor+" realizado com sucesso!");
        System.out.println("Volte sempre!!\n\n\n");
    }
}
