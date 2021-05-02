package AP_Summatieve_Opdracht_1;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        // ----------- SOLDAAT CLASS TEST ----------- //
        Soldaat S1 = new Soldaat("Thomas de Vries",118100,"Utrecht"); // Gegevens correct
        Soldaat S2 = new Soldaat("Maria Jansen",117834,"Utrecht"); // Gegevens correct
        Soldaat S3 = new Soldaat("Johan van den Berg",119819,"Zuid Holland"); // Provincie klopt niet dus moet een error geven.

        // ----------- Trainingsveld CLASS TEST ----------- //
        Trainingsveld V1 = new Trainingsveld("Bernhardkazerne","Utrecht","P104-2");
        Trainingsveld V2 = new Trainingsveld("Jansenkazerne","Utrecht","40-P90");

        // ----------- Training CLASS TEST ----------- //
        List<Soldaat> Soldaten = new ArrayList<Soldaat>();

        Training T1 = new Training(S1, V1,"9:45");

        T1.addTrainee(Soldaten,S1);
        T1.addTrainee(Soldaten,S2);
        T1.addTrainee(Soldaten,S3);

        T1.displayTrainees(Soldaten);

        //T1.CheckTrainees(Soldaten,S1);

    }
}
