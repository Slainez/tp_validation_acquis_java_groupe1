package TPRecapitulatifs;

public class Voiture extends Vehicules {

    public Voiture(String anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    void demarrer() {
        System.out.println("la voiture démarre");
    }

    @Override
    void accelerer() {
        System.out.println("la voiture accélère");
    }
}
