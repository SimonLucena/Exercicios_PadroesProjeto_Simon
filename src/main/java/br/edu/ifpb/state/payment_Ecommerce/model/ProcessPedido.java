package br.edu.ifpb.state.payment_Ecommerce.model;

import br.edu.ifpb.state.payment_Ecommerce.strategy.PagamentoStrategy;
import br.edu.ifpb.state.payment_Ecommerce.strategy.modelos.PagamentoCartaoStrategy;
import br.edu.ifpb.state.payment_Ecommerce.strategy.modelos.PagamentoPayPalStrategy;

import java.util.Scanner;

public class ProcessPedido {
    public void iniciarOperacao() {
        Scanner reader = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.println("Iniciando operacao...\n");
        while (pedido.isOpen()) {
            System.out.print("Selecione o item para adicioná-lo ao carrinho\n" +
                "1- Placa mãe (R$367,98)\n" +
                "2- CPU (R$612,47)\n" +
                "3- GPU (R$799,50)\n"
            );
            int escolha = Integer.parseInt(reader.nextLine());
            System.out.println(pedido.addProduto(escolha));

            System.out.println("Deseja prosseguir para pagamento?(N/s)");
            String pagar = reader.nextLine();

            if(pagar.equalsIgnoreCase("S")){
                pedido.pagarPedido();
                processarPagamento(reader, pedido);
                pedido.openPedido();
            }
        }
    }

    private void processarPagamento(Scanner reader, Pedido pedido) {
        PagamentoStrategy strategy;

        System.out.println("\n\nIniciando pagamento...\n");

        while (!pedido.isPaid() && !pedido.isCanceled() && !pedido.isClosed()){
            System.out.print("Selecione a forma de pagamento\n" +
                "0- Cancelar\n" +
                "1- Cartão de crédito\n" +
                "2- PayPal\n"
            );
            int escolha = Integer.parseInt(reader.nextLine());

            switch (escolha){
                case 0:
                    pedido.cancelar();
                    break;
                case 1:
                    strategy = new PagamentoCartaoStrategy();
                    if(strategy.pagar(pedido)){
                        pedido.pedidoPago();
                    }
                    break;
                case 2:
                    strategy = new PagamentoPayPalStrategy();
                    if(strategy.pagar(pedido)){
                        pedido.pedidoPago();
                    }
                    break;
            }
        }
    }
}
