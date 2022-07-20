package TPRecapitulatifs;

import java.util.ArrayList;

public class TP1 {
    public static void main(String[] args) {

       int[] tableauEntiers = {12, 3, 5, 6, -3};

       int[] resultats = rechercheMinMax(tableauEntiers);
       int max = resultats[0];
       int min = resultats[1];

        System.out.println(displayResults(tableauEntiers, resultats));

       System.out.printf("résultat: plus grand = %d\nPlus petit = %d", max, min);
    }
    static int[] rechercheMinMax(int[] tableau) {

        int[] indices = new int[2];
        int max = tableau[0];
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            } else if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        indices[0] = max;
        indices[1] = min;
        return indices;
    }

    static String displayResults(int[] tableau, int[] resultats) {
        String stringTab = "[";
        for (int i = 0; i < tableau.length; i++) {
            stringTab += Integer.toString(tableau[i]);
            if (i == resultats[0]) {
                stringTab += "(PG)";
            } else if (i == resultats[1]) {
                stringTab += "(PP)";
            }
            stringTab += i== tableau.length -1 ? "" : ",";
        }
        return stringTab + "]";
    }
}
