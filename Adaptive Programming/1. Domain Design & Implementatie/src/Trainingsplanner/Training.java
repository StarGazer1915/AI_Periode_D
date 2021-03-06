package Trainingsplanner;

import java.util.List;

public class Training {

    private final Trainee trainee;
    private final Locatie locatie;

    /**
     * Deze constructor gebruikt twee interfaces. Hij verzameld de informatie welke hij vervolgens
     * in een if-statement plaatst en kijkt of de provincies van de militaire basis en de soldaat overeenkomen.
     * Als de provincies niet overeenkomen geeft hij een Exception.
     * Als dat wel zo is, dan wordt een training gemaakt en uitgeprint.
     */

    public Training(Trainee trainee, Locatie locatie) {
        this.trainee = trainee;
        this.locatie = locatie;
    }

    static void addTrainee(List Soldaten, Trainee trainee) {
        Soldaten.add(trainee);
    }

    static void displayTrainees(List Soldaten) {
        for (Object item : Soldaten) {
            System.out.println(item);
        }
    }

    static boolean CheckIfTrainee(List Soldaten, Trainee trainee) {
        if ( Soldaten.contains(trainee) ) {
            return true;
        } else {
            System.out.println(trainee);
            return false;
        }
    }

    static String createTraining(List Soldaten, Trainee trainee, Locatie locatie) {
        if (CheckIfTrainee(Soldaten, trainee) && locatie.getBprovincie().equals(trainee.getProvincie())) {
            return "Training voor " + trainee.getNaam() + " | ID: " + trainee.getId() + " is mogelijk.\n" +
                    "Basis: " + locatie.getBnaam() + " | Veld: " + locatie.getVeld();
        } else {
            return "Geen training mogelijk. Trainee maakt geen deel uit van deze geplande training.";
        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainee=" + trainee +
                ", locatie=" + locatie +
                '}';
    }
}
