package ObjectsAndClasses;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    private Car audi;
    private Car nissan;

    @Before
    public void setUp() {
        audi = new Car("Audi");
        nissan = new Car("Nissan");
    }

    @Test
    public void testAccelerate() {
        audi.accelerate();
        audi.accelerate();
        nissan.accelerate();

        assertEquals(20, audi.getCurrentSpeed());
        assertEquals(10, nissan.getCurrentSpeed());
    }

    @Test
    public void testPark() {
        audi.accelerate();
        audi.park();
        assertEquals(0, audi.getCurrentSpeed());
    }

    // You can add more test methods here

    // No need for the main method here
}
