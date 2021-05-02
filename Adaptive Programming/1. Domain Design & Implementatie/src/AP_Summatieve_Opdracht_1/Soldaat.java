package AP_Summatieve_Opdracht_1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldaat soldaat = (Soldaat) o;
        return id == soldaat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
