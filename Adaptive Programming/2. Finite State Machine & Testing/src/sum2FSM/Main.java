package sum2FSM;

import Formatief2A.Node;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String input = "ADABFCEDEADEABFFC";

        HashMap<String, Node> NodeMap0 = new HashMap<>();
        HashMap<String, Node> NodeMap1 = new HashMap<>();
        HashMap<String, Node> NodeMap2 = new HashMap<>();
        HashMap<String, Node> NodeMap3 = new HashMap<>();
        HashMap<String, Node> NodeMap4 = new HashMap<>();
        HashMap<String, Node> NodeMap5 = new HashMap<>();

        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        Node S3 = new Node("S3");
        Node S4 = new Node("S4");
        Node S5 = new Node("S5");

        NodeMap0.put("A",S0);
        NodeMap0.put("B",S1);
        NodeMap0.put("C",S2);
        NodeMap0.put("D",S3);
        NodeMap0.put("E",S4);
        NodeMap0.put("F",S5);

        NodeMap1.put("A",S5);
        NodeMap1.put("C",S2);
        NodeMap1.put("D",S0);
        NodeMap1.put("E",S1);
        NodeMap1.put("F",S4);

        NodeMap2.put("C",S5);
        NodeMap2.put("D",S1);
        NodeMap2.put("E",S3);
        NodeMap2.put("F",S0);

        NodeMap3.put("A",S3);
        NodeMap3.put("B",S2);
        NodeMap3.put("C",S1);
        NodeMap3.put("D",S4);
        NodeMap3.put("E",S0);
        NodeMap3.put("F",S5);

        NodeMap4.put("A",S4);
        NodeMap4.put("B",S0);
        NodeMap4.put("F",S3);

        NodeMap5.put("A",S2);
        NodeMap5.put("B",S3);
        NodeMap5.put("C",S1);
        NodeMap5.put("D",S4);
        NodeMap5.put("E",S5);


        FSM fsm = new FSM(input, NodeMap0);
        //fsm.startMachine("?");

    }
}
