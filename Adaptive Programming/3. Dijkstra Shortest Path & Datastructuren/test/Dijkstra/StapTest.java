package Dijkstra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapTest {

    private Treinrit T0 = new Treinrit("Amsterdam", "Rotterdam", 24);
    private Rit R0 = new Rit("Amsterdam", "Utrecht", 28);
    private Vlucht V0 = new Vlucht("Amsterdam", "Parijs", 428);

    @Test
    void getSize() {
        int A = T0.getSize();
        int B = R0.getSize();
        int C = V0.getSize();

        assertEquals(24, A);
        assertEquals(28, B);
        assertEquals(428, C);
    }
}