package Trainingsplanner;

public class Soldaat extends Persoon implements Trainee {

    private final int id;
    private final String provincie;

    /**
     * Dit is de soldaat-class, deze class bevat het ID, provincie en de naam van de class "Persoon". (overerving)
     *
     * @param naam : String
     * @param id : int
     * @param provincie : String
     */

    public Soldaat(String naam, int id, String provincie) {
        super(naam);
        this.id = id;
        this.provincie = provincie;
    }

    public int getId() {
        return id;
    }

    public String getProvincie() {
        return provincie;
    }

    public String toString() {
        return "Soldaat{" +
                "naam=" + getNaam() +
                " id=" + id +
                ", provincie='" + provincie + '\'' +
                '}';
    }
}
