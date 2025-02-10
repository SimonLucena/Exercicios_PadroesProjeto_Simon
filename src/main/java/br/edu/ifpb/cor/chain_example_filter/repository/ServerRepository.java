package br.edu.ifpb.cor.chain_example_filter.repository;

import br.edu.ifpb.cor.chain_example_filter.middleware.Middleware;
import br.edu.ifpb.cor.chain_example_filter.model.User;

import java.util.ArrayList;
import java.util.List;

public class ServerRepository {
    private final List<User> users;
    private Middleware middleware;

    public ServerRepository() {
        users = new ArrayList<User>();
        users.add(new User("admin@exemplo", "123"));
        users.add(new User("teste1@teste", "321"));
        users.add(new User("teste2@teste", "213"));
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public boolean hasEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidPassword(String email, String password) {
        return getUserByEmail(email).getPassword().equals(password);
    }

    public boolean logIn(String email, String password) {
        if(middleware.check(email, password)){
            return true;
        }
        return false;
    }
}
