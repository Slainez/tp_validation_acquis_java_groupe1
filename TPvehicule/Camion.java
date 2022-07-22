package TPRecapitulatifs.TPvehicule;

import TPRecapitulatifs.TPvehicule.Vehicules;

public class Camion extends Vehicules {

    public Camion(String anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    void demarrer() {
        System.out.println("le camion démarre");
    }

    @Override
    void accelerer() {
        System.out.println("le camion accélère");
    }
}
