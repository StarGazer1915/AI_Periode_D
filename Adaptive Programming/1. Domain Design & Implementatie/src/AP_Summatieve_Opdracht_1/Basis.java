package AP_Summatieve_Opdracht_1;

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
    public String toString() {
        return "Basis{" +
                "Bnaam='" + Bnaam + '\'' +
                ", Blocatie='" + Bprovincie + '\'' +
                '}';
    }
}
