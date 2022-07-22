package TPRecapitulatifs.TPbibliothèque;

public class Oeuvre {

    private String titre;

    private String langue = "français";

    private Auteur auteur;

    public Oeuvre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.langue = langue;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

    public String afficher() {
        return String.format("%s %s , en %s\n", titre, auteur.getNom(), langue);
    }
}
