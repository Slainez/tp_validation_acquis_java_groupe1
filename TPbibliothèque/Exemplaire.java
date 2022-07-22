package TPRecapitulatifs.TPbibliothèque;

public class Exemplaire {

    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire -> %s, %s en %s\n", oeuvre.getTitre(), oeuvre.getAuteur().getNom(), oeuvre.getLangue());
    }

    // constructeur de copie
    public Exemplaire (Exemplaire exemplaire) {
        this.oeuvre = exemplaire.getOeuvre();
        System.out.printf("copie d'un exemplaire -> %s, %s en %s", oeuvre.getTitre(), oeuvre.getAuteur().getNom(), oeuvre.getLangue());
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public String afficher() {
        return String.format("Un exemplaire de %s", oeuvre.afficher());
    }
}
