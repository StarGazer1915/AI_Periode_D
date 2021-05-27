package Dijkstra;

import java.util.PriorityQueue;

public class Reis implements Comparable<Reis> {

    private String naam;
    private PriorityQueue<Stap> stappen;

    public Reis(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public PriorityQueue getStappen() {
        return stappen;
    }

    public void setStappen(PriorityQueue<Stap> stappen) {
        this.stappen = stappen;
    }

    @Override
    public int compareTo(Reis Bravo) {
        int A = stappen.stream().mapToInt(stap -> stap.getSize()).sum();
        int B = Bravo.getTotalSize();
        if ( B > A ) {
            System.out.println("-----| " + naam + " is korter/kleiner dan " + Bravo.getNaam() + " |-----" +
                    "\n" + naam + " = " + A +
                    "\n" + Bravo.getNaam() + " = " + B + "\n");
            return 1;
        } else {
            System.out.println("-----| " + naam + " is langer/groter dan " + Bravo.getNaam() + " |-----" +
                    "\n" + naam + " = " + A +
                    "\n" + Bravo.getNaam() + " = " + B + "\n");
            return -1;
        }
    }

    public int getTotalSize() {
        return stappen.stream().mapToInt(stap -> stap.getSize()).sum();
    }

    @Override
    public String toString() {
        return "Reis{" +
                "naam='" + naam + '\'' +
                ", stappen=" + stappen +
                '}';
    }
}
