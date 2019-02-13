import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine(100, 50, "petrol");
        tyre = new Tyre(100, 50, "Goodyear");
        petrolCar = new PetrolCar("Ford", "Fiesta", 1000, "purple", engine, "Sale");
        petrolCar.addTyre(tyre);
        petrolCar.addTyre(tyre);
        petrolCar.addTyre(tyre);
        petrolCar.addTyre(tyre);
    }

    @Test
    public void hasFourTyres() {
        assertEquals(true, petrolCar.hasFourTyres());
    }

    @Test
    public void doesNotHaveFourTyres(){
        petrolCar = new PetrolCar("Ford", "Fiesta", 1000, "purple", engine, "Sale");
        petrolCar.addTyre(tyre);
        petrolCar.addTyre(tyre);
        petrolCar.addTyre(tyre);
        assertEquals(false, petrolCar.hasFourTyres());
    }

    @Test
    public void canFuel(){
        String fueling = petrolCar.powerUp("petrol");
        assertEquals("Car is filled with petrol", fueling);
    }
}
