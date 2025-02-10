package br.edu.ifpb.state.payment_Ecommerce.service;

import br.edu.ifpb.state.payment_Ecommerce.model.UsuarioPayPal;
import br.edu.ifpb.state.payment_Ecommerce.repository.UsuarioPayPalRepository;

public class PayPalService {
    private final UsuarioPayPalRepository usuarioPayPalRepository = new UsuarioPayPalRepository();

    public boolean validarPerfil(UsuarioPayPal usuarioPayPal) {
        String email = usuarioPayPal.email;
        String senha = usuarioPayPal.senha;

        for (UsuarioPayPal usuarioBase : usuarioPayPalRepository.getUsers()){
            if(usuarioBase.email.equals(email) &&
                    usuarioBase.senha.equals(senha)){
                return true;
            }
        }

        return false;
    }
}
