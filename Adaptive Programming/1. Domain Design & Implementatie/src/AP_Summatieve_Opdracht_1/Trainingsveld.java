package AP_Summatieve_Opdracht_1;

public class Trainingsveld extends Basis implements Locatie {

    private String veld;

    /**
     * Dit is de Trainingsveld-class, deze class bevat de naam van de basis, de provincie en het veld.
     * De basisnaam en provincie komen uit de Basis-class d.m.v. een overervingsrelatie.
     *
     * @param b_naam
     * @param b_provincie
     * @param veld
     */

    public Trainingsveld(String b_naam, String b_provincie, String veld) {
        super(b_naam, b_provincie);
        this.veld = veld;
    }

    public String getVeld() {
        return veld;
    }

    @Override
    public String toString() {
        return "Trainingsveld{" +
                "b_naam='" + getB_naam() +
                "b_provincie='" + getB_provincie() +
                "veld='" + veld +
                '\'' +
                '}';
    }
}
