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
        /**
         * Maak een lijst aan (path) welke de nodes krijgt als strings wanneer hij er langs komt.
         * Pak de eerste node als startpunt en zoek op basis van die node en de char uit het
         * woord de volgende node.
         */

        List<String> path = new ArrayList<>();
        Node state = (Node) startMap.values().toArray()[0];
        for (char ch: woord.toCharArray()) {
            Node newNode = state.getNextState(""+ch);
            if (newNode == null) {
                continue;
            }
            path.add(newNode.getNaam());
            state = newNode;
        }
        System.out.println(path);
        return path;
    }

    @Override
    public String toString() {
        return "FSM{" +
                "input='" + input + '\'' +
                '}';
    }
}
