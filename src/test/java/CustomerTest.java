import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Steven", 5000);
    }

    @Test
    public void canDecreaseWallet() {
        customer.decreaseWallet(1000);
        assertEquals(4000, customer.getWallet(), 0.01);
    }


}
