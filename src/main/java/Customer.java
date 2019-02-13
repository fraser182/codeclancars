import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    String name;
    double wallet;
    ArrayList<Vehicle> cars;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.cars = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void decreaseWallet(double price){
        this.wallet -= price;
    }

//    not used yet
    public void addCar(Vehicle car){
        this.cars.add(car);
    }
}
