package Dijkstra;

public class Rit extends Stap {

    private final int km;

    public Rit(String locA, String locB, int km) {
        super(locA, locB);
        this.km = km;
    }

    public int getKilometers() {
        return km;
    }

    @Override
    public int getSize() {
        return km;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "km=" + km +
                '}';
    }
}
