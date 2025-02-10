package br.edu.ifpb.strategy.payment_Ecommerce.model;

public class Pedido {
    Double valor;
    boolean process;
    boolean pago;

    public Pedido() {
        this.valor = 0.0;
        this.process = true;
        this.pago = false;
    }

    public Double getValor() {
        return valor;
    }

    public boolean isClosed() {
        return this.process;
    }

    public void closeProcess() {
        this.process = false;
    }

    public void addValor(double valor) {
        this.valor += valor;
    }

    public String addProduto(int escolha) {
        return switch (escolha) {
            case 0 -> {
                this.process = false;
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

    public boolean isPayed() {
        return this.pago;
    }

    public void pagarPedido() {
        this.pago = true;
    }
}
