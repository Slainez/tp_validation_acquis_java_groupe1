package TPRecapitulatifs;

public class Exemplaire {

    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public String afficher() {
        return String.format("Un exemplaire de %s, %s en %s", oeuvre.getTitre(), oeuvre.getAuteur(), oeuvre.getLangue());
    }
}
