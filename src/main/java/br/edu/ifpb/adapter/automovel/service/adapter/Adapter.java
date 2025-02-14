package br.edu.ifpb.adapter.automovel.service.adapter;

import br.edu.ifpb.adapter.automovel.model.Automovel;

public interface Adapter {
    // returns speed in KMPH or anorther measure
    public double getSpeed();
    public void setVehicle(Automovel automovel);
}
