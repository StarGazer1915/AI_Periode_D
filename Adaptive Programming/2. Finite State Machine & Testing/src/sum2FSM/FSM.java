package sum2FSM;

import java.util.*;

public class FSM {

    private final String input;

    public FSM(String input) {
        this.input = input;
    }

    public List startMachine(String woord) {
        HashMap<String, Node> NodeMap = new HashMap<>();
        Random rand = new Random();

        // Maakt willekeurig nodes/verbindingen met letters/nummers/tekens van de input
        // Als de interactie met 'randint1' weggehaald zou worden dan worden alle symbolen van input als nodes opgeslagen.
        for (char ch: input.toCharArray()) {
            int randint1 = rand.nextInt(20);
            if (randint1 > 10) {
                Node X = new Node(""+ch); // De namen van de nodes zijn chars uit de input.
                NodeMap.put(""+ch, X);
            }
        }

        // Zet alle verbindingen voor iedere node zodat ze weten bij welke nodes ze moeten zijn.
        for (Map.Entry<String,Node> item: NodeMap.entrySet()) {
            Node n = item.getValue();
            n.setNodemap(NodeMap);
        }

        List<String> Nodes = new ArrayList<>();
        Node state = (Node) NodeMap.values().toArray()[0];
        state.setNodemap(NodeMap);

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
