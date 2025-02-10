package br.edu.ifpb.strategy.payment_Ecommerce.strategy.modelos;

import br.edu.ifpb.strategy.payment_Ecommerce.model.Cartao;
import br.edu.ifpb.strategy.payment_Ecommerce.service.CartaoService;
import br.edu.ifpb.strategy.payment_Ecommerce.strategy.PagamentoStrategy;

import java.util.Scanner;

public class PagamentoCartaoStrategy implements PagamentoStrategy {
    private final CartaoService cartaoService = new CartaoService();

    @Override
    public boolean pagar(double valor) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("\nInforme os detalhes da conta:\n");
            System.out.println("Número do cartão:");
            String numero = entrada.nextLine();

            System.out.println("Data de expiração(mm/yy):");
            String expiracaoStr = entrada.nextLine();

            System.out.println("Código de segurança:");
            String cvv = entrada.nextLine();

            Cartao cartao = new Cartao(numero, expiracaoStr, cvv);

            if (cartaoService.validarCartao(cartao)){
                System.out.println("\nOperação concluída com sucesso!.");
                imprimir(valor);
                return true;
            }else {
                System.out.println("Dados de cartão inexistentes ou inválidos.");
                return false;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Formato de data inválido! Use MM/yy.");
            return false;
        }
    }
}
