package br.edu.ifpb.cor.chain_example_filter.middleware;

import br.edu.ifpb.cor.chain_example_filter.model.User;
import br.edu.ifpb.cor.chain_example_filter.repository.ServerRepository;

public class UserExistsMiddleware extends Middleware {
    private ServerRepository serverRepository;
    private User user;

    public UserExistsMiddleware(ServerRepository serverRepository) {
        this.serverRepository = serverRepository;
    }

    @Override
    public boolean check(String email, String password) {
        if (!serverRepository.hasEmail(email)) {
            System.out.println("Email não registrado\n");
            return false;
        }
        if(!serverRepository.isValidPassword(email, password)) {
            System.out.println("Senha invalida\n");
            return false;
        }
        return checkNext(email, password);
    }

}
