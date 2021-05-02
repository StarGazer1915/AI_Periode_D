package AP_Summatieve_Opdracht_1;

public class Trainingsveld extends Basis implements Locatie {

    private final String veld;

    /**
     * Dit is de Trainingsveld-class, deze class bevat de naam van de basis, de provincie en het veld.
     * De basisnaam en provincie komen uit de Basis-class d.m.v. een overervingsrelatie.
     *
     * @param Bnaam String
     * @param Bprovincie String
     * @param veld String
     */

    public Trainingsveld(String Bnaam, String Bprovincie, String veld) {
        super(Bnaam, Bprovincie);
        this.veld = veld;
    }

    @Override
    public String getVeld() {
        return veld;
    }

    @Override
    public String toString() {
        return "Trainingsveld{" +
                "Bnaam= '" + getBnaam() +
                "' | Bprovincie= '" + getBprovincie() +
                "' | veld= '" + veld +
                '\'' +
                '}';
    }
}
