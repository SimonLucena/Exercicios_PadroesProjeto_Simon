package br.edu.ifpb.state.payment_Ecommerce.strategy.modelos;

import br.edu.ifpb.state.payment_Ecommerce.model.Pedido;
import br.edu.ifpb.state.payment_Ecommerce.model.UsuarioPayPal;
import br.edu.ifpb.state.payment_Ecommerce.service.PayPalService;
import br.edu.ifpb.state.payment_Ecommerce.strategy.PagamentoStrategy;

import java.util.Scanner;

public class PagamentoPayPalStrategy implements PagamentoStrategy {
    private final PayPalService payPalService = new PayPalService();

    @Override
    public boolean pagar(Pedido pedido) {
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("\nInforme os detalhes da conta:\n");
            System.out.println("Email:");
            String email = entrada.nextLine();

            System.out.println("Senha:");
            String senha = entrada.nextLine();

            UsuarioPayPal user = new UsuarioPayPal(email, senha);

            if(payPalService.validarPerfil(user)){
                System.out.println("\nOperação concluída com sucesso!.");
                imprimir(pedido);
                return true;
            }else {
                System.out.println("Dados de cartão inexistentes ou inválidos.");
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Formato de data inválido! Use MM/yy.");
            return false;
        }
    }
}
