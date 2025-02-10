package br.edu.ifpb.state.payment_Ecommerce.state;

public enum PedidoStateEnum implements PedidoState {
    ABERTO{
        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public PedidoState cancelPedido() {
            return CANCELADO;
        }

        @Override
        public PedidoState openPedido() {
            return ABERTO;
        }

        @Override
        public boolean isOpen() {
            return true;
        }

        @Override
        public PedidoState closePedido() {
            return FECHADO;
        }

        @Override
        public boolean isCanceled() {
            return false;
        }

        @Override
        public PedidoState startPayment() {
            return PAGANDO;
        }

        @Override
        public boolean isPaid() {
            return false;
        }
    },
    PAGANDO{
        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public PedidoState cancelPedido() {
            return CANCELADO;
        }

        @Override
        public PedidoState openPedido() {
            return ABERTO;
        }

        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public PedidoState closePedido() {
            return FECHADO;
        }

        @Override
        public boolean isCanceled() {
            return false;
        }

        @Override
        public PedidoState startPayment() {
            return PAGANDO;
        }

        @Override
        public boolean isPaid() {
            return false;
        }
    },
    FECHADO{
        @Override
        public boolean isClosed() {
            return true;
        }

        @Override
        public PedidoState cancelPedido() {
            return CANCELADO;
        }

        @Override
        public PedidoState openPedido() {
            return ABERTO;
        }

        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public PedidoState closePedido() {
            return FECHADO;
        }

        @Override
        public boolean isCanceled() {
            return true;
        }

        @Override
        public PedidoState startPayment() {
            return PAGANDO;
        }

        @Override
        public boolean isPaid() {
            return true;
        }
    },
    CANCELADO{
        @Override
        public PedidoState openPedido() {
            return ABERTO;
        }

        @Override
        public boolean isOpen() {
            return false;
        }

        @Override
        public PedidoState closePedido() {
            return FECHADO;
        }

        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public PedidoState cancelPedido() {
            return CANCELADO;
        }

        @Override
        public boolean isCanceled() {
            return false;
        }

        @Override
        public PedidoState startPayment() {
            return PAGANDO;
        }

        @Override
        public boolean isPaid() {
            return false;
        }
    }
}
