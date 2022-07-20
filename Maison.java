package TPRecapitulatifs;

public class Maison extends Batiment {

    private int nbPieces;

    public Maison(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Avec %d pièces", nbPieces);
    }
}
