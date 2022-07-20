package TPRecapitulatifs;

import java.util.Scanner;

public class TP9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Rentrer une chaîne de caractères: ");
        String chaine = input.nextLine();

        System.out.printf("Caractères identiques dans une rangée: %s", caracteres(chaine));
    }

    static boolean caracteres(String chaine) {
        for (int i = 0; i < chaine.length() - 1; i++) {
            if (chaine.charAt(i) == chaine.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
}
