package ObjectsAndClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarTest {

    private static Car audi;
    private static Car nissan;

    @BeforeAll
    public static void setUp() {
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
