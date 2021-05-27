package Dijkstra;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        // ---------- Create queue for Treinritten. ---------- \\
        PriorityQueue<Stap> TAlpha = new PriorityQueue<>();

        Treinrit TA0 = new Treinrit("Utrecht", "Rotterdam", 32);
        Treinrit TA1 = new Treinrit("Rotterdam", "Amsterdam", 22);
        Treinrit TA2 = new Treinrit("Amsterdam", "Haarlem", 15);
        Treinrit TA3 = new Treinrit("Haarlem", "Den Helder", 12);

        TAlpha.add(TA0);
        TAlpha.add(TA1);
        TAlpha.add(TA2);
        TAlpha.add(TA3);

        PriorityQueue<Stap> TBravo = new PriorityQueue<>();

        Treinrit TB0 = new Treinrit("Utrecht", "Amsterdam", 24);
        Treinrit TB1 = new Treinrit("Amsterdam", "Haarlem", 15);
        Treinrit TB2 = new Treinrit("Haarlem", "Den Helder", 12);

        TBravo.add(TB0);
        TBravo.add(TB1);
        TBravo.add(TB2);

        // -------------------- Treinreizen -------------------- \\
        Reis TR0 = new Reis("Treinreis 0");
        TR0.setStappen(TAlpha);

        Reis TR1 = new Reis("Treinreis 1");
        TR1.setStappen(TBravo);

        TR0.compareTo(TR1); // Compared de treinreizen in minuten en print het resultaat.


        // ---------- Create queue for Ritten. ---------- \\
        PriorityQueue<Stap> RAlpha = new PriorityQueue<>();

        Rit RA0 = new Rit("Utrecht", "Rotterdam", 28);
        Rit RA1 = new Rit("Rotterdam", "Goes", 32);
        Rit RA2 = new Rit("Goes", "Middelburg", 4);

        RAlpha.add(RA0);
        RAlpha.add(RA1);
        RAlpha.add(RA2);

        PriorityQueue<Stap> RBravo = new PriorityQueue<>();

        Rit RB0 = new Rit("Utrecht", "Amsterdam", 20);
        Rit RB1 = new Rit("Amsterdam", "Den Haag", 42);
        Rit RB2 = new Rit("Den Haag", "Rotterdam", 6);
        Rit RB3 = new Rit("Rotterdam", "Middelburg", 30);

        RBravo.add(RB0);
        RBravo.add(RB1);
        RBravo.add(RB2);
        RBravo.add(RB3);

        // -------------------- Autoritten -------------------- \\
        Reis RI0 = new Reis("Autorit 0");
        RI0.setStappen(RAlpha);

        Reis RI1 = new Reis("Autorit 1");
        RI1.setStappen(RBravo);

        RI0.compareTo(RI1); // Compared de autoritten in kilometers en print het resultaat.


        // ---------- Create queue for Vluchten. ---------- \\
        PriorityQueue<Stap> VAlpha = new PriorityQueue<>();

        Vlucht VA0 = new Vlucht("Amsterdam", "Parijs", 480);
        Vlucht VA1 = new Vlucht("Parijs", "London", 300);

        VAlpha.add(VA0);
        VAlpha.add(VA1);

        PriorityQueue<Stap> VBravo = new PriorityQueue<>();

        Vlucht VB0 = new Vlucht("Amsterdam", "London", 380);

        VBravo.add(VB0);

        // -------------------- Autoritten -------------------- \\
        Reis VL0 = new Reis("Vlucht 0");
        VL0.setStappen(VAlpha);

        Reis VL1 = new Reis("Vlucht 1");
        VL1.setStappen(VBravo);

        VL0.compareTo(VL1); // Compared de vluchten in kosten (euro's) en print het resultaat.
    }
}