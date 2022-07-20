package TPRecapitulatifs;

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
                if (exemplaire.getOeuvre().getLangue().equals(lg)) {
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

    public void afficherAuteur(boolean isPrime) {
        Optional<Boolean> prix = Optional.ofNullable(isPrime);
        for (Exemplaire exemplaire: exemplaires) {
            boolean prime = exemplaire.getOeuvre().getAuteur().getPrix();
            if (prix.isPresent()) {
                if (isPrime) {
                    // si true afficher les auteurs avec des prix
                    if (prime) {
                        System.out.println(exemplaire.getOeuvre().getAuteur().toString()+ "\n");
                    }
                } else {
                    // si false afficher les auteurs sans prix
                    if (!prime) {
                        System.out.println(exemplaire.getOeuvre().getAuteur().toString() + "\n");
                    }
                }
            } else {
                // afficher que les auteurs avec prix
                if (prime) {
                    System.out.println(exemplaire.getOeuvre().getAuteur().toString()+ "\n");
                }
            }
        }
    }
}
