package TPRecapitulatifs;

public class Tirelire {

    private double montant;

    public double getMontant() {
        return montant;
    }

    public String afficher() {
        return montant == 0.0 ? "Vous êtes sans le sous" : String.format("Vous avez %.1f euros dans votre tirelire", montant);
    }

    public String secouer() {
        return montant == 0.0 ? "" : "Bing bing\n";
    }

    public void remplir(double montant) {
        if (montant > 0.0) {
            this.montant = montant;
        }
    }

    public void vider() {
        montant = 0.0;
    }

    public void puiser(double montantPuise) {
        if (montantPuise > 0.0 && montantPuise < montant) {
            montant -= montantPuise;
        } else if (montantPuise == montant) {
            vider();
        }
    }

    public double calculerSolde(double budget) {
        if (montant - budget >= 0.0) {
            System.out.println("Vous êtes assez riche pour partir en vacances:");
            System.out.printf("Il vous restera: %.1f euros\n", montant - budget);
        } else {
            System.out.printf("Il vous manque %.1f euros pour partir en vacances", budget - montant);
        }
        return montant - budget >= 0.0 ? montant - budget : getMontant();
    }
}
