package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        // ---------- Create queue for Treinritten. ---------- \\
        PriorityQueue<Treinrit> TAlpha = new PriorityQueue<>();

        Treinrit TA0 = new Treinrit("Utrecht", "Rotterdam", 32);
        Treinrit TA1 = new Treinrit("Rotterdam", "Amsterdam", 22);
        Treinrit TA2 = new Treinrit("Amsterdam", "Haarlem", 15);
        Treinrit TA3 = new Treinrit("Haarlem", "Den Helder", 12);

        TAlpha.add(TA0);
        TAlpha.add(TA1);
        TAlpha.add(TA2);
        TAlpha.add(TA3);

        PriorityQueue<Treinrit> TBravo = new PriorityQueue<>();

        Treinrit TB0 = new Treinrit("Utrecht", "Amsterdam", 24);
        Treinrit TB1 = new Treinrit("Amsterdam", "Haarlem", 15);
        Treinrit TB2 = new Treinrit("Haarlem", "Den Helder", 12);

        TAlpha.add(TB0);
        TAlpha.add(TB1);
        TAlpha.add(TB2);

        // -------------------- Treinreizen -------------------- \\
        Reis TR0 = new Reis("Treinreis 0");
        TR0.setStappen(TAlpha);
        Reis TR1 = new Reis("Treinreis 1");
        TR1.setStappen(TBravo);





        // ---------- Create queue for Ritten. ---------- \\
        PriorityQueue<Rit> queueA = new PriorityQueue<>();

        // ---------- Create queue for Vluchten. ---------- \\
        PriorityQueue<Vlucht> queueV = new PriorityQueue<>();



    }
}
