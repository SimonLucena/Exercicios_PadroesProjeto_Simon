package br.edu.ifpb.cor.chain_example_filter.middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@exemplo")){
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);

    }
}
