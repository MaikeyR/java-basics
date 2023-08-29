package Interfaces;

import org.junit.jupiter.api.Test;

public class WashingMachineTest {

    @Test
    public void testStartButtonPressed() {
        WashingMachine samsungWashingMachine = new SamsungWashingMachine();
        samsungWashingMachine.startButtonPressed();
    }
}
