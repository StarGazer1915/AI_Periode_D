package sum2FSM;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class NodeTest {

    private Node t1 = new Node("A");
    private Node t2 = new Node("B");

    @Test
    public void testGetNaam() {
        assertEquals("A", t1.getNaam());
        assertEquals("B", t2.getNaam());
    }

    @Test
    public void testSetNodemap() {
        HashMap<String, Node> NodeMap = new HashMap<>();
        NodeMap.put("test2", t2);

        t1.setNodemap(NodeMap);
        HashMap Map = t1.getNodemap();

        assertEquals(Map , NodeMap);
    }

    @Test
    public void testGetNextState() {
        HashMap<String, Node> NodeMap = new HashMap<>();
        NodeMap.put("A", t2);
        t1.setNodemap(NodeMap);

        assertEquals(t1.getNextState("A") , t2);
    }
}