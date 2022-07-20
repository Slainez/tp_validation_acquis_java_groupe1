package TPRecapitulatifs;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractères:");
        String chaine = input.nextLine();
        System.out.println(upperWord(chaine));

    }

    static String upperWord(String chaine) {
        chaine = chaine.replaceAll(" +", " ");
        String[] chaineString = chaine.split(" ");
        for (int i = 0; i < chaineString.length; i++) {
            String firstLetter = chaineString[i].substring(0, 1);
            String after = chaineString[i].substring(1);
            chaineString[i] = firstLetter.toUpperCase() + after;
        }
        return String.join(" ", chaineString);
    }
}
