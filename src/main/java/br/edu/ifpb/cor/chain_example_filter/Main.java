package br.edu.ifpb.cor.chain_example_filter;

import br.edu.ifpb.cor.chain_example_filter.middleware.Middleware;
import br.edu.ifpb.cor.chain_example_filter.middleware.RoleCheckMiddleware;
import br.edu.ifpb.cor.chain_example_filter.middleware.ThrottlingMiddleware;
import br.edu.ifpb.cor.chain_example_filter.middleware.UserExistsMiddleware;
import br.edu.ifpb.cor.chain_example_filter.repository.ServerRepository;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static ServerRepository serverRepository = new ServerRepository();

    private static void init(){
        serverRepository = new ServerRepository();

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.setNext(new UserExistsMiddleware(serverRepository))
                .setNext(new RoleCheckMiddleware());

        serverRepository.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        Scanner reader = new Scanner(System.in);

        boolean success = false;
        boolean placeholder;
        do {
            System.out.print("Enter email: ");
            String email = reader.nextLine();
            System.out.print("Input password: ");
            String password = reader.nextLine();
            if(Objects.equals(password, "")){
                success = true;
            }
            placeholder = serverRepository.logIn(email, password);
        } while (!success);

    }
}
