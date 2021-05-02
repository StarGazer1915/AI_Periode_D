package AP_Summatieve_Opdracht_1;

import java.util.List;

public class Training {

    private Trainee trainee; // List van trainees maken (methode addTrainee(), list.contains() trainee)
    private final Locatie locatie;
    private final String tijdstip;

    /**
     * Deze constructor gebruikt twee interfaces. Hij verzameld de informatie welke hij vervolgens
     * in een if-statement plaatst en kijkt of de provincies van de militaire basis en de soldaat overeenkomen.
     * Als de provincies niet overeenkomen geeft hij een Exception.
     * Als dat wel zo is, dan wordt een training gemaakt en uitgeprint.
     *
     * @param tijdstip : String
     */

    public Training(Trainee trainee, Locatie locatie, String tijdstip) {
        this.trainee = trainee;
        this.locatie = locatie;
        this.tijdstip = tijdstip;
    }

    static List addTrainee(List Soldaten, Trainee trainee) {
        Soldaten.add(trainee);
        return Soldaten;
    }

    static void CheckTrainees(List Soldaten, Trainee trainee) {
        for (Object temp : Soldaten) {
            System.out.println(temp);
        }
    }

    static void displayTrainees(List Soldaten) {
        for (Object temp : Soldaten) {
            System.out.println(temp);
        }
    }


}
