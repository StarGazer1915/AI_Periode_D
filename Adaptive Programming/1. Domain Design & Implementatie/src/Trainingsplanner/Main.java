package Trainingsplanner;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ----------- SOLDAAT CLASS TEST ----------- //
        Soldaat S1 = new Soldaat("Thomas de Vries",118100,"Utrecht"); // Gegevens correct
        Soldaat S2 = new Soldaat("Maria Jansen",117834,"Utrecht"); // Gegevens correct
        Soldaat S3 = new Soldaat("Johan van den Berg",119819,"Zuid Holland"); // Provincie klopt niet dus moet een error geven.

        // ----------- Trainingsveld CLASS TEST ----------- //
        Trainingsveld V1 = new Trainingsveld("Bernhardkazerne","Utrecht","P104-2");
        Trainingsveld V2 = new Trainingsveld("Jansenkazerne","Utrecht","40-P90");

        // ----------- Training CLASS TEST ----------- //
        // Maak een nieuw trainingsobject.
        Training T1 = new Training(S1, V1);

        // Maak een lijst voor soldaten.
        List<Soldaat> SoldatenT1 = new ArrayList<Soldaat>();

        // Voeg soldaten toe.
        T1.addTrainee(SoldatenT1,S1);
        T1.addTrainee(SoldatenT1,S2);
        T1.addTrainee(SoldatenT1,S3);

        // Print lijst van soldaten.
        // T1.displayTrainees(SoldatenT1);

        // Kijk of er een training kan worden gepland.
        System.out.println(Training.createTraining(SoldatenT1,S1,V1));
    }
}
