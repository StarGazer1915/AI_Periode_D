package AP_Summatieve_Opdracht_1;

public class Executor {

    public static void main(String[] args) throws Exception {

        // ----------- SOLDAAT CLASS TEST ----------- //
        Soldaat S1 = new Soldaat("Thomas de Vries",118100,"Utrecht"); // Gegevens correct
        Soldaat S2 = new Soldaat("Maria Jansen",117834,"Brabant"); // Gegevens correct
        Soldaat S3 = new Soldaat("Johan van den Berg",117834,"Zuid Holland"); // Provincie klopt niet dus moet een error geven.

        //System.out.println(S1.toString());
        //System.out.println(S2.toString());    // toString() functies voor de individuele soldaten.
        //System.out.println(S3.toString());


        // ----------- Trainingsveld CLASS TEST ----------- //
        Trainingsveld T1 = new Trainingsveld("Bernhardkazerne","Utrecht","P104-2");
        Trainingsveld T2 = new Trainingsveld("Vliegbasis Volkel","Brabant","V47");
        Trainingsveld T3 = new Trainingsveld("Vliegkamp de Kooy","Noord Holland","90 AB");

        //System.out.println(T1.toString());
        //System.out.println(T2.toString());    // toString() functies voor de individuele trainingsvelden.
        //System.out.println(T3.toString());


        // ----------- Training CLASS TEST ----------- //
        Training Train1 = new Training(S1,T1,"9:45");
        Training Train2 = new Training(S2,T2,"11:45");      // Zie de class "Training.java" voor meer informatie.
        Training Train3 = new Training(S3,T3,"18:00");
    }
}
