package sum2FSM;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import java.util.List;

public class FSMTest {

    private FSM f1 = new FSM("0123456789abcdefghijklmnopqrstuvwxyz");

    @Test
    public void testStartMachineOutput() {
        List x = f1.startMachine("hemellichamen24");
        List y = f1.startMachine("5718279847912875");
        List z = f1.startMachine("ddddddddddddddd");
        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }
}