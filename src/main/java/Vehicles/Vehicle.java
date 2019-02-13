package Vehicles;

import Components.Component;
import Components.Engine;
import Components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    String make;
    String model;
    double price;
    String colour;
    Engine engine;
    ArrayList<Tyre> tyres;
    String saleType;

    public Vehicle(String make, String model, double price, String colour, Engine engine, String saleType) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = new ArrayList<Tyre>();
        this.saleType = saleType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public String getSaleType() {
        return saleType;
    }

    public void addTyre(Tyre tyre){
        this.tyres.add(tyre);
    }

    public boolean hasFourTyres(){
        if (this.tyres.size() == 4){
            return true;
        }
        return false;
    }

}

