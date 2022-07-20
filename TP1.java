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
        int max = 0;
        int min = 0;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
                indexMax = i;
            } else if (tableau[i] < min) {
                min = tableau[i];
                indexMin = i;
            }
        }
        indices[0] = indexMax;
        indices[1] = indexMin;
        return indices;
    }

    static String displayResults(int[] tableau, int[] resultats) {
        String stringTab = "[";
        for (int i = 0; i < tableau.length; i++) {
            stringTab += Integer.toString(tableau[i]);
            if (i == resultats[0]) {
                stringTab += "(PP)";
            } else if (i == resultats[1]) {
                stringTab += "PG";
            }
            stringTab += i== tableau.length -1 ? "" : ",";
        }
        return stringTab + "]";
    }
}
