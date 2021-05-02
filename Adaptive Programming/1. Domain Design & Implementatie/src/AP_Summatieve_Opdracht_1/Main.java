package AP_Summatieve_Opdracht_1;

public class Main {

    public static void main(String[] args) throws Exception {

        // ----------- SOLDAAT CLASS TEST ----------- //
        Soldaat S1 = new Soldaat("Thomas de Vries",118100,"Utrecht"); // Gegevens correct
        Soldaat S2 = new Soldaat("Maria Jansen",117834,"Brabant"); // Gegevens correct
        Soldaat S3 = new Soldaat("Johan van den Berg",119819,"Zuid Holland"); // Provincie klopt niet dus moet een error geven.

        // ----------- Trainingsveld CLASS TEST ----------- //
        Trainingsveld V1 = new Trainingsveld("Bernhardkazerne","Utrecht","P104-2");
        Trainingsveld V2 = new Trainingsveld("Vliegbasis Volkel","Brabant","V47");
        Trainingsveld V3 = new Trainingsveld("Vliegkamp de Kooy","Noord Holland","90 AB");

        // ----------- Training CLASS TEST ----------- //
        Training Train1 = new Training(S1,V1,"9:45");
        Training Train2 = new Training(S2,V2,"11:45");      // Zie de class "Training.java" voor meer informatie.
        Training Train3 = new Training(S3,V3,"18:00");
    }
}
