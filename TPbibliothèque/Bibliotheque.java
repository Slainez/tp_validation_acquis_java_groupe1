package TPRecapitulatifs.TPbibliothèque;

import TPRecapitulatifs.TPbibliothèque.Exemplaire;
import TPRecapitulatifs.TPbibliothèque.Oeuvre;

import java.util.ArrayList;
import java.util.Optional;

public class Bibliotheque {

    private String nom;

    ArrayList<Exemplaire> exemplaires = new ArrayList<>();

    public Bibliotheque(String nom) {
        this.nom = nom;
        System.out.printf("La bibliothèque %s est ouverte\n", nom);
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires() {
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre, int nbExemplaire) {
        if (nbExemplaire > 1) {
            for (int i = 0; i < nbExemplaire; i++) {
                Exemplaire exemplaire = new Exemplaire(oeuvre);
                exemplaires.add(exemplaire);
            }
        } else {
            Exemplaire exemplaire = new Exemplaire(oeuvre);
            exemplaires.add(exemplaire);
        }
    }

    public ArrayList<Exemplaire> listerExemplaires(Oeuvre oeuvre,  String langue ) {
        ArrayList<Exemplaire> listEx = new ArrayList<>();
        Optional<String> lg = Optional.ofNullable(langue);
        for ( Exemplaire exemplaire : exemplaires) {
            if (lg.isPresent()) {
                if (exemplaire.getOeuvre().getLangue().equals(langue)) {
                    listEx.add(exemplaire);
                }
            } else {
                if (exemplaire.getOeuvre() == oeuvre) {
                    listEx.add(exemplaire);
                }
            }
        }
        return listEx;
    }

    public int compterExemplaires(Oeuvre oeuvre) {
        int count = 0;
        for (Exemplaire exemplaire: exemplaires) {
            if (exemplaire.getOeuvre() == oeuvre) {
                count++;
            }
        }
        return count;
    }

    public void afficherAuteur() {
        for ( Exemplaire exemplaire : exemplaires) {
            if (exemplaire.getOeuvre().getAuteur().getPrix()) {
                System.out.printf("%s \n", exemplaire.getOeuvre().getAuteur().getNom());
            }
        }
    }
    public void afficherAuteur(boolean isPrime) {
        for (Exemplaire exemplaire: exemplaires) {
            boolean prime = exemplaire.getOeuvre().getAuteur().getPrix();
                if (isPrime && exemplaire.getOeuvre().getAuteur().getPrix()) {
                    System.out.printf("%s \n", exemplaire.getOeuvre().getAuteur().getNom());
                } else if (!isPrime && !exemplaire.getOeuvre().getAuteur().getPrix()) {
                    System.out.printf("%s \n", exemplaire.getOeuvre().getAuteur().getNom());
                }
        }
    }
}
