package Dijkstra;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {

    private Treinrit TA0 = new Treinrit("Test1", "Test2", 32);
    private Treinrit TA1 = new Treinrit("Test2", "Test3", 32);
    private Treinrit TB0 = new Treinrit("Test1", "Test2", 32);
    private Treinrit TB1 = new Treinrit("Test2", "Test3", 32);

    @Test
    void testCompareToifSame() {
        PriorityQueue<Stap> TA = new PriorityQueue<>();
        PriorityQueue<Stap> TB = new PriorityQueue<>();

        TA.add(TA0);
        TA.add(TA1);
        TB.add(TB0);
        TB.add(TB1);

        Reis TR0 = new Reis("Treinreis TEST 0");
        TR0.setStappen(TA);

        Reis TR1 = new Reis("Treinreis TEST 1");
        TR1.setStappen(TB);

        int A = TR0.getTotalSize();
        int B = TR1.getTotalSize();

        assertTrue(TR0.compareTo(TR1) == 0);
    }

    @Test
    void getTotalSize() {
        PriorityQueue<Stap> TA = new PriorityQueue<>();

        TA.add(TA0);
        TA.add(TA1);

        Reis TR0 = new Reis("'Treinreis TEST 0'");
        TR0.setStappen(TA);

        assertTrue(TR0.getTotalSize() == 64);
    }
}