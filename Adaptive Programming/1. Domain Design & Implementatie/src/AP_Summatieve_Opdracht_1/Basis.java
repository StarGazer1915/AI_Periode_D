package AP_Summatieve_Opdracht_1;

public class Basis {

    private String b_naam;
    private String b_provincie;

    /**
     * Dit is de Basis-class, deze class bevat de naam en provincie van een militaire basis.
     * Deze class wordt ge-extend door de trainingsveld-class. (overerving)
     *
     * @param b_naam
     * @param b_provincie
     */

    public Basis(String b_naam, String b_provincie) {
        this.b_naam = b_naam;
        this.b_provincie = b_provincie;
    }

    public String getB_naam() {
        return b_naam;
    }

    public String getB_provincie() {
        return b_provincie;
    }

    @Override
    public String toString() {
        return "Basis{" +
                "b_naam='" + b_naam + '\'' +
                ", b_locatie='" + b_provincie + '\'' +
                '}';
    }
}
