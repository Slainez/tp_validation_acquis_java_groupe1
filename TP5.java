package TPRecapitulatifs;

import java.util.Arrays;

public class TP5 {
    public static void main(String[] args) {

        char[] charTab = {'a', 'd', 'S', 't', 'I', 'r', 'q'};
        System.out.println(Arrays.toString(upperLower(charTab)));


    }

    static char[] upperLower(char[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            if (i % 2 == 0) {
                tableau[i] = Character.toLowerCase(tableau[i]);
            } else {
                tableau[i] = Character.toUpperCase(tableau[i]);
            }
        }
        return tableau;
    }
}
