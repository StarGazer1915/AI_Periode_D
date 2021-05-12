package Formatief2A;

import java.util.ArrayList;
import java.util.List;

public class FSM {

    private String input;
    private Node start;

    public FSM(String input, Node start) {
        this.input = input;
        this.start = start;
    }

    List startMachine() {
        List<String> Nodes = new ArrayList<String>();
        Node State = start;
        Nodes.add(State.getNaam());
        for (char ch: input.toCharArray()) {
            Node newNode = State.getNextState(""+ch+"");
            Nodes.add(newNode.getNaam());
            State = newNode;
        }
        System.out.println(Nodes);
        return Nodes;
    }
}
