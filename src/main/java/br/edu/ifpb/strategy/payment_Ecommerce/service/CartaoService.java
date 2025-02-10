package br.edu.ifpb.strategy.payment_Ecommerce.service;

import br.edu.ifpb.strategy.payment_Ecommerce.model.Cartao;
import br.edu.ifpb.strategy.payment_Ecommerce.repository.CartaoRepository;

public class CartaoService {
    private final CartaoRepository cartaoRepository = new CartaoRepository();

    public boolean validarCartao(Cartao cartao) {
        String numero = cartao.numero;
        String expiracao = cartao.expiracao;
        String cvv = cartao.cvv;

        for (Cartao cartaoBase : cartaoRepository.getCartoes()){
            if(cartaoBase.numero.equals(numero) &&
                cartaoBase.expiracao.equals(expiracao) &&
                cartaoBase.cvv.equals(cvv)){
                return true;
            }
        }

        return false;
    }
}
