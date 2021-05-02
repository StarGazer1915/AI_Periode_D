package Trainingsplanner;

public class Persoon {

    private String naam;

    /**
     * Dit is de Persoon-class, deze class bevat de naam van een persoon, deze class wordt
     * ge-extend door de soldaat-class. (overerving)
     *
     * @param naam
     */

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
