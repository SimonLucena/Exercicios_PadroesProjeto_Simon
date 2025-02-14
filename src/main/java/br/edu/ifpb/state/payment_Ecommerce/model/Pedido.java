package br.edu.ifpb.state.payment_Ecommerce.model;

import br.edu.ifpb.state.payment_Ecommerce.state.PedidoState;
import static br.edu.ifpb.state.payment_Ecommerce.state.PedidoStateEnum.ABERTO;

public class Pedido {
    Double valor;
    PedidoState estadoAtual;

    public Pedido() {
        this.valor = 0.0;
        this.estadoAtual = ABERTO;
    }

    public Double getValor() {
        return valor;
    }

    public void closeProcess() {
        this.estadoAtual = estadoAtual.closePedido();
    }

    public void addValor(double valor) {
        this.valor += valor;
    }

    public String addProduto(int escolha) {
        return switch (escolha) {
            case 0 -> {
                this.estadoAtual = estadoAtual.closePedido();
                yield "Processo finalizado.\n";
            }
            case 1 -> {
                addValor(367.98);
                yield "Placa mãe adicionada.\n";
            }
            case 2 -> {
                addValor(612.47);
                yield "CPU adicionada.\n";
            }
            case 3 -> {
                addValor(799.50);
                yield "GPU adicionada.\n";
            }
            default -> "Opção invalida.\n";
        };
    }

    public void pagarPedido() {
        this.estadoAtual = estadoAtual.startPayment();
    }

    public boolean isPaid() {
        return this.estadoAtual.isPaid();
    }

    public boolean isCanceled() {
        return this.estadoAtual.isCanceled();
    }

    public void cancelar() {
        this.estadoAtual = estadoAtual.cancelPedido();
    }

    public boolean isOpen() {
        return this.estadoAtual.isOpen();
    }

    public boolean isClosed() {
        return this.estadoAtual.isClosed();
    }

    public void pedidoPago() {
        this.estadoAtual = estadoAtual.closePedido();
    }

    public void openPedido() {
        this.estadoAtual = estadoAtual.openPedido();
    }
}
