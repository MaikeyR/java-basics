package Interfaces;

import org.junit.Test;

public class WashingMachineTest {

    @Test
    public void testStartButtonPressed() {
        WashingMachine samsungWashingMachine = new SamsungWashingMachine();
        samsungWashingMachine.startButtonPressed();
    }
}
