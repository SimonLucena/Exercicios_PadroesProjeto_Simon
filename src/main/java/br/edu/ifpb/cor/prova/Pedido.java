package br.edu.ifpb.cor.prova;

public class Pedido {
    private boolean emEstoque;
    private boolean freteCalculado = false;
    private boolean descontoAplicado = false;
    private boolean pagamentoProcessado = false;
    private double valorTotal = 0.0;

    public boolean isFreteCalculado() {
        return freteCalculado;
    }

    public void setFreteCalculado(boolean freteCalculado) {
        this.freteCalculado = freteCalculado;
    }

    public boolean isDescontoAplicado() {
        return descontoAplicado;
    }

    public void setDescontoAplicado(boolean descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }

    public boolean isPagamentoProcessado() {
        return pagamentoProcessado;
    }

    public void setPagamentoProcessado(boolean pagamentoProcessado) {
        this.pagamentoProcessado = pagamentoProcessado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }
}
