package br.edu.ifpb.adapter.adapter.model;

import br.edu.ifpb.adapter.adapter.service.adapter.Automovel;

public class AstonMartin implements Automovel {
    @Override
    public double getSpeed() {
        return 220;
    }
}
