package TPRecapitulatifs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rentrez une chaine:");
        String chaine = input.nextLine();
        chaine = chaine.replaceAll(" +", " ");
        String[] chaineString = chaine.split(" ");

        HashMap<String, Integer> doublonsList = new HashMap<>();

        // recherche de doublons
        for (int i = 0; i < chaineString.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chaineString.length; j++) {
                if (chaineString[j].equals(chaineString[i])) {
                    count++;
                    chaineString[j] = "";
                }
            }
            if (count > 1) {
                doublonsList.put(chaineString[i], count);
            }
            chaine = String.join(" ", chaineString).replaceAll(" +", " ");
            chaineString = chaine.split(" ");
        }

        System.out.println("la liste de doublons: " + doublonsList.toString());
        System.out.println("la chaine sans doublons: " + chaine);
    }
}
