package TPRecapitulatifs;

abstract public class Vehicules {
    private int matricule;
    private String anneeModele;
    private double prix;
    private static int count = 0;
    public Vehicules(String anneeModele, double prix) {
        count++;
        this.matricule = count;
        this.anneeModele = anneeModele;
        this.prix = prix;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getAnneeModele() {
        return anneeModele;
    }

    public void setAnneeModele(String anneeModele) {
        this.anneeModele = anneeModele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return String.format("Matricule: %d\nAnnée: %s\nPrix: %.1f", matricule, anneeModele, prix);
    }
    abstract void demarrer();
    abstract void accelerer();
}
