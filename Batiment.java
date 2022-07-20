package TPRecapitulatifs;

public class Batiment {
    private String adresse;

    public Batiment() {

    };

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        String ad = adresse == null ? "pas d'adresse" : adresse;
        return String.format("c'est un bâtiment situé à : %s\n", ad);
    }
}
