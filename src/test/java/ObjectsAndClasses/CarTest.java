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

        audi.printCurrentSpeed();
        nissan.printCurrentSpeed();
    }

    @Test
    public void testAccelerate() {
        audi.accelerate();
        audi.accelerate();
        nissan.accelerate();

        audi.printCurrentSpeed();
        nissan.printCurrentSpeed();

        assertEquals(20, audi.getCurrentSpeed());
        assertEquals(10, nissan.getCurrentSpeed());
    }

    @Test
    public void testPark() {
        audi.accelerate();
        audi.park();

        audi.printCurrentSpeed();
        nissan.printCurrentSpeed();

        assertEquals(0, audi.getCurrentSpeed());
    }

    // You can add more test methods here

    // No need for the main method here
}
