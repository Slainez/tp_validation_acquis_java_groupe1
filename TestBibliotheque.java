package TPRecapitulatifs;

public class TestBibliotheque {
    public static void main(String[] args) {

        Bibliotheque bibli = new Bibliotheque("municipale");

        Auteur auteur1 = new Auteur("Victor Hugo", false);
        Auteur auteur2 = new Auteur("Alexandre DUMAS", false);
        Auteur auteur3 = new Auteur("Raymond Queneau", true);

        Oeuvre oeuvre1 = new Oeuvre("les misérables", auteur1, "français");
        Oeuvre oeuvre2 = new Oeuvre("L'homme qui rit", auteur1, "français");
        Oeuvre oeuvre3 = new Oeuvre("Le Comte de Monte Cristo", auteur2, "français");
        Oeuvre oeuvre4 = new Oeuvre("Zazie dans le métro", auteur3, "français");
        Oeuvre oeuvre5 = new Oeuvre("The count of MonteCristo", auteur1, "anglais");

        Exemplaire exemplaire1 = new Exemplaire(oeuvre1);
        Exemplaire exemplaire2 = new Exemplaire(oeuvre1);
        Exemplaire exemplaire3 = new Exemplaire(oeuvre2);
        Exemplaire exemplaire4 = new Exemplaire(oeuvre3);
        Exemplaire exemplaire5 = new Exemplaire(oeuvre3);
        Exemplaire exemplaire6 = new Exemplaire(oeuvre3);
        Exemplaire exemplaire7 = new Exemplaire(oeuvre4);
        Exemplaire exemplaire8 = new Exemplaire(oeuvre5);


        bibli.stocker(oeuvre1, 2);
        bibli.stocker(oeuvre2, 1);
        bibli.stocker(oeuvre3, 3);
        bibli.stocker(oeuvre4, 1);
        bibli.stocker(oeuvre5, 1);

        bibli.afficherAuteur(true);
    }
}
