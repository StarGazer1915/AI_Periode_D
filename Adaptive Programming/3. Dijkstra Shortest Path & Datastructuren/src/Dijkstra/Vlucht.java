package Dijkstra;

public class Vlucht extends Stap {

    private final int euro;

    public Vlucht(String locA, String locB, int euro) {
        super(locA, locB);
        this.euro = euro;
    }

    public int getEuro() {
        return euro;
    }

    @Override
    public int getSize() {
        return euro;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "euro=" + euro +
                '}';
    }
}
