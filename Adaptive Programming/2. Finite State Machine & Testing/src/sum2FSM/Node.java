package sum2FSM;

import java.util.HashMap;

public class Node {

    private final String naam;
    private HashMap nodemap;

    public Node(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNodemap(HashMap nodemap) {
        this.nodemap = nodemap;
    }

    public Node getNextState(String symbol) {
        if (nodemap.containsKey(symbol)) {
            Node x = (Node)nodemap.get(symbol);
            return x;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "naam='" + naam + '\'' +
                '}';
    }
}