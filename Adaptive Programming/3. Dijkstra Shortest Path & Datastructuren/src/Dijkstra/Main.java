package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Stap> queue = new PriorityQueue<>();

        Reis R0 = new Reis("Reis 0");
        R0.setStappen(queue);
    }
}
