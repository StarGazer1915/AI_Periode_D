package Dijkstra;

public abstract class Stap implements Comparable<Stap> {

    private String locA;
    private String locB;

    public Stap(String locA, String locB) {
        this.locA = locA;
        this.locB = locB;
    }

    public abstract int getSize();

    @Override
    public int compareTo(Stap o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Stap{" +
                "locA='" + locA + '\'' +
                ", locB='" + locB + '\'' +
                '}';
    }
}