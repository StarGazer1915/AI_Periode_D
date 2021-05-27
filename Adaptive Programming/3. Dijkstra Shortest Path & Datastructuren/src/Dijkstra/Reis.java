package Dijkstra;

import java.util.PriorityQueue;

public class Reis implements Comparable<Reis> {

    private String naam;
    private PriorityQueue stappen;

    public Reis(String naam) {
        this.naam = naam;
    }

    public PriorityQueue getStappen() {
        return stappen;
    }

    public void setStappen(PriorityQueue stappen) {
        this.stappen = stappen;
    }

    @Override
    public int compareTo(Reis o) {
        return 0;
    }
}
