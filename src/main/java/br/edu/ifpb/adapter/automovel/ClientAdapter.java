package br.edu.ifpb.adapter.automovel;

import br.edu.ifpb.adapter.automovel.model.AstonMartin;
import br.edu.ifpb.adapter.automovel.model.BugattiVeyron;
import br.edu.ifpb.adapter.automovel.model.McLaren;
import br.edu.ifpb.adapter.automovel.service.adapter.Adapter;
import br.edu.ifpb.adapter.automovel.model.Automovel;
import br.edu.ifpb.adapter.automovel.service.adapter.ConversorKMPH;

public class ClientAdapter {
    public static void main(String args[]) {
    	Automovel bugattiVeyron = new BugattiVeyron("16.4", 267.86);
    	Adapter conversor = new ConversorKMPH(bugattiVeyron);
    	System.out.println("Bugatti Veyron Super Sport's top speed is " + conversor.getSpeed() + " Kmph.");

        Automovel mcLaren = new McLaren("GT", 204.0);
        conversor.setVehicle( mcLaren );
        System.out.println("McLaren F1 top speed is " + conversor.getSpeed() + " Kmph.");

        Automovel astonMartin = new AstonMartin("Vanquish", 214.0);
        conversor.setVehicle(astonMartin);
        System.out.println("Aston Martin top speed is " + conversor.getSpeed() + " Kmph.");
        
        // Se quiser em MPH
        System.out.println("Aston Martin top speed is " + astonMartin.getSpeed() + " mph.");
    }
}
