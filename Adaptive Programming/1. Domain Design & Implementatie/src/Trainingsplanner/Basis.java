package Trainingsplanner;

import java.util.Objects;

public class Basis {

    private final String Bnaam;
    private final String Bprovincie;

    /**
     * Dit is de Basis-class, deze class bevat de naam en provincie van een militaire basis.
     * Deze class wordt ge-extend door de trainingsveld-class. (overerving)
     *
     * @param Bnaam String
     * @param Bprovincie String
     */

    public Basis(String Bnaam, String Bprovincie) {
        this.Bnaam = Bnaam;
        this.Bprovincie = Bprovincie;
    }

    public String getBnaam() {
        return Bnaam;
    }

    public String getBprovincie() {
        return Bprovincie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basis basis = (Basis) o;
        return Objects.equals(Bprovincie, basis.Bprovincie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Bprovincie);
    }

    @Override
    public String toString() {
        return "Basis{" +
                "Bnaam='" + Bnaam + '\'' +
                ", Blocatie='" + Bprovincie + '\'' +
                '}';
    }
}
