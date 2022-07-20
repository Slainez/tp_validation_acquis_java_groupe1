package TPRecapitulatifs;

public class Auteur {

    private String nom;

    private boolean prime;

    public Auteur(String nom, boolean prime) {
        this.nom = nom;
        this.prime = prime;
    }

    public String getNom() {
        return nom;
    }

    public boolean getPrix() {
        return prime;
    }
}
