package sum2FSM;

public class Main {

    public static void main(String[] args) {

        String input = "0123456789abcdefghijklmnopqrstuvwxyz";
        String woord = "85amsterdamsegrachten24";

        FSM fsm = new FSM(input);
        fsm.startMachine(woord);
    }
}
