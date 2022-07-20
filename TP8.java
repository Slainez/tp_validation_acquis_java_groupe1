package TPRecapitulatifs;

import java.util.ArrayList;
import java.util.Arrays;

public class TP8 {
    public static void main(String[] args) {

        int[] tableauEntree = {3, 2, 4, 7, 5, -1};
        int somme = 6;
        ArrayList<Integer[]> resultats = new ArrayList<>();

        resultats = rechercheCouples(tableauEntree, somme);

        System.out.println("Résultats: ");
        int indice = 0;
        for (Integer[] ligne : resultats) {
            System.out.printf("couple %d: %s\n", indice, Arrays.toString(ligne));
            indice++;
        }
    }

    static ArrayList<Integer[]> rechercheCouples(int[] tableau, int somme) {
        ArrayList<Integer[]> resultats = new ArrayList<>();
        int indiceResultats = 0;
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i+1; j < tableau.length; j++) {
                Integer[] sousTableauResultats = new Integer[2];
                if (tableau[i] + tableau[j] == somme) {
                    sousTableauResultats[0] = tableau[i];
                    sousTableauResultats[1] = tableau[j];
                    resultats.add(indiceResultats, sousTableauResultats);
                    indiceResultats++;
                }
            }
        }
        return resultats;
    }
}
