package Formatief2A;

public class Main {

    public static void main(String[] args) {

        String input = "BABBAABBBAAA";

        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        Node S3 = new Node("S3");

        S0.setNodeA(S2);
        S0.setNodeB(S1);
        S1.setNodeA(S1);
        S1.setNodeB(S2);
        S2.setNodeA(S2);
        S2.setNodeB(S3);
        S3.setNodeA(S3);
        S3.setNodeB(S0);

        FSM fsm = new FSM(input,S0);

        fsm.startMachine();
    }
}
