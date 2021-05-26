package sum2FSM;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class FSM {

    private final String input;
    private final HashMap startMap;

    public FSM(String input, HashMap startMap) {
        this.input = input;
        this.startMap = startMap;
    }

    public List startMachine(String woord) {
        List<String> Nodes = new ArrayList<>();

        Node state = (Node) startMap.values().toArray()[0];

        for (char ch: woord.toCharArray()) {
            // Loop door alle symbolen van het woord heen en creer een
            // nieuwe lijst van strings op basis van de namen van de eerder aangemaakte nodes.
            Node newNode = state.getNextState(""+ch);
            if (newNode == null) {
                continue;
            }
            Nodes.add(newNode.getNaam());
            state = newNode;
        }
        System.out.println(Nodes);
        return Nodes;

        // Let op!: De waarde van Nodes is nu een lijst van strings welke als nodes zijn opgeslagen.
        // Dit betekent dat als de letter 'a' als node is opgeslagen alle 'a' symbolen in het woord
        // als string in de lijst worden opgeslagen. Het tegenovergestelde geld voor de nodes die niet zijn
        // opgeslagen en worden dus ook niet in de lijst getoond.
    }

    @Override
    public String toString() {
        return "FSM{" +
                "input='" + input + '\'' +
                '}';
    }
}
