package br.edu.ifpb.cor.prova;

public class VerificarEmEstoque implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public void handle(Pedido p) {
        if(p.isEmEstoque()){
            next.handle(p);
        }else{
            setNext(null);
        }
    }
}
