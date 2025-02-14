package br.edu.ifpb.adapter.automovel.model;

public class AstonMartin implements Automovel {
    String modelo = "";
    double velocidade = 0.0;

    public AstonMartin(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public double getSpeed() {
        return this.velocidade;
    }
}
