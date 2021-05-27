package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        // ---------- Create queue for Treinritten. ---------- \\
        PriorityQueue<Treinrit> queueT = new PriorityQueue<>();

        Treinrit T0 = new Treinrit("Utrecht Centraal", "Utrecht Overvecht", 6);
        Treinrit T1 = new Treinrit("Utrecht Overvecht", "Hollandse Rading", 18);
        Treinrit T2 = new Treinrit("Hollandse Rading", "Hilversum Sportpark", 10);
        Treinrit T3 = new Treinrit("Hilversum Sportpark", "Hilversum Centraal", 5);
        Treinrit T4 = new Treinrit("Hilversum Centraal", "Hilversum Mediapark", 5);

        queueT.add(T0);
        queueT.add(T1);
        queueT.add(T2);
        queueT.add(T3);
        queueT.add(T4);

        // ---------- Create queue for Ritten. ---------- \\
        PriorityQueue<Rit> queueA = new PriorityQueue<>();

        // ---------- Create queue for Vluchten. ---------- \\
        PriorityQueue<Vlucht> queueV = new PriorityQueue<>();


        // ---------- Reis ---------- \\
        Reis R0 = new Reis("Reis 0");
        R0.setStappen(queue);
    }
}
