import static org.junit.Assert.assertEquals;

import Components.Engine;
import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(100, 50, "petrol");
    }

    @Test
    public void hasCost(){
        assertEquals(100, engine.getCost(), 0.01);
    }

    @Test
    public void hasRepairCost() {
        assertEquals(50, engine.getRepairCost(), 0.01);
    }

    @Test
    public void hasType(){
        assertEquals("petrol", engine.getType());
    }
}
