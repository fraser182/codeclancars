import Behaviours.IPowerUp;
import Components.Engine;
import Components.Tyre;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class PetrolCar extends Vehicle implements IPowerUp {

    public PetrolCar(String make, String model, double price, String colour, Engine engine, String saleType) {
        super(make, model, price, colour, engine, saleType);
    }

    public String powerUp(String fuel){
        return "Car is filled with " + fuel;
    }

}
