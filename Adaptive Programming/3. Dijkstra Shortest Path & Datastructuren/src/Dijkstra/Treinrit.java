package Dijkstra;

public class Treinrit extends Stap {

    private final int min;

    public Treinrit(String locA, String locB, int min) {
        super(locA, locB);
        this.min = min;
    }

    public int getMin() {
        return min;
    }
}
