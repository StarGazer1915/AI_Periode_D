package sum2FSM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class NodeTest {

    private Node S0 = new Node("A");
    private Node S1 = new Node("B");
    private Node S2 = new Node("C");
    private Node S3 = new Node("D");
    private Node S4 = new Node("E");

    @Test
    public void testGetNaam() {
        assertEquals("A", S0.getNaam());
        assertEquals("B", S1.getNaam());
    }

    @Test
    public void testSetAndGetNodemap() {
        HashMap <String, Node> NodeMapTest = new HashMap();

        NodeMapTest.put("A", S0);
        NodeMapTest.put("B", S1);

        S0.setNodemap(NodeMapTest);

        assertEquals(S0.getNodemap(), NodeMapTest);
    }

    @Test
    public void testGetNextState() {
        HashMap <String, Node> NodeMapTest = new HashMap();

        NodeMapTest.put("A", S0);
        NodeMapTest.put("B", S1);
        NodeMapTest.put("C", S2);
        NodeMapTest.put("D", S3);
        NodeMapTest.put("E", S4);

        S0.setNodemap(NodeMapTest);

        assertEquals(S0.getNextState("C"), S2);
        assertEquals(S0.getNextState("E"), S4);
        // assertEquals(S0.getNextState("A"), S1); // Deze geeft een error wat klopt.
    }
}