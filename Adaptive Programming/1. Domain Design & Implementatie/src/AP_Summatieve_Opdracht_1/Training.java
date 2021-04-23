package AP_Summatieve_Opdracht_1;

public class Training {

    private final Trainee trainee;
    private final Locatie locatie;
    private String tijdstip;


    /**
     * Deze constructor gebruikt twee interfaces. Hij verzameld de informatie welke hij vervolgens
     * in een if-statement plaatst en kijkt of de provincies van de militaire basis en de soldaat overeenkomen.
     * Als de provincies niet overeenkomen geeft hij een Exception. Als dat wel zo is, dan wordt een training gemaakt en uitgeprint.
     *
     * @param tijdstip : String
     */

    public Training(Trainee trainee, Locatie locatie, String tijdstip) throws Exception {
        if ( ! trainee.getProvincie().equals(locatie.getB_provincie())) {
            throw new Exception("Provincie's komen niet overeen. Er kan geen training worden gepland voor '" + trainee.getNaam() + "'.");
        }
        else {
            System.out.println("Provincie's komen overeen: Ja");
            System.out.println("--- Training ---" +
                    "\nNaam: " + trainee.getNaam() +
                    "\nID: " + trainee.getId() +
                    "\nBasis: " + locatie.getB_naam() +
                    "\nVeld: " + locatie.getVeld() +
                    "\nTijdstip: " + tijdstip + "\n");
        }
        this.trainee = trainee;
        this.locatie = locatie;
        this.tijdstip = tijdstip;
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainee=" + trainee +
                ", locatie=" + locatie +
                ", tijdstip='" + tijdstip + '\'' +
                '}';
    }
}
