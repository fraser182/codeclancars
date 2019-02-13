import Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre(100, 50, "Goodyear");
    }

    @Test
    public void hasCost(){
        assertEquals(100, tyre.getCost(), 0.01);
    }

    @Test
    public void hasRepairCost() {
        assertEquals(50, tyre.getRepairCost(), 0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("Goodyear", tyre.getMake());
    }
}
