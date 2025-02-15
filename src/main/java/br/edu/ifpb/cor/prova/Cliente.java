package br.edu.ifpb.cor.prova;

public class Cliente {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setEmEstoque(false);
        pedido.setValorTotal(64.82);

        Handler h1 = new VerificarEmEstoque();
        Handler h2 = new CalcularFrete();
        Handler h3 = new AplicarDesconto();
        Handler h4 = new ProcessarPagamento();
        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        h4.setNext(null);

        h1.handle(pedido);

        if (pedido.isPagamentoProcessado()) {
            System.out.println("Pagamento processado com sucesso!");
        }else {
            System.out.println("Falha ao processar pagamento!");
        }
    }
}
