package sum2FSM;

public class Node {

    private final String naam;
    private Node nodeA;
    private Node nodeB;

    public Node(String naam) {
        this.naam = naam;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }

    public String getNaam() {
        return naam;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public Node getNextState(String letter) {
        if (letter.equals("A")) {
            return getNodeA();
        } else if (letter.equals("B")) {
            return getNodeB();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "naam='" + naam + '\'' +
                '}';
    }
}