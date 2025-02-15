package br.edu.ifpb.cor.prova;

public class AplicarDesconto implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public void handle(Pedido p) {
        p.setDescontoAplicado(true);
        if(next != null){
            next.handle(p);
        }
    }
}
