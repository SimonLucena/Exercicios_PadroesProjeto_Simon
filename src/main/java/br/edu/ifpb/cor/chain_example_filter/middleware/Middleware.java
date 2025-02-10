package br.edu.ifpb.cor.chain_example_filter.middleware;

public abstract class Middleware {
    private Middleware next;

    public Middleware setNext(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next != null) {
            return next.check(email, password);
        }
        return true;
    }
}
