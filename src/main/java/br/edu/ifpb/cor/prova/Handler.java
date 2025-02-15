package br.edu.ifpb.cor.prova;

public interface Handler {
    public void setNext(Handler h);
    public void handle(Pedido p);
}
