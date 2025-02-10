package br.edu.ifpb.state.payment_Ecommerce.state;

public interface PedidoState {
    PedidoState openPedido();
    boolean isOpen();
    PedidoState closePedido();
    boolean isClosed();
    PedidoState cancelPedido();
    boolean isCanceled();
    PedidoState startPayment();
    boolean isPaid();
}
