package TPRecapitulatifs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {

        int[] tableauInitial = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer la taille de découpage: ");
        int taille = input.nextInt();

        int[][] tableauDecoupe = decoupage(tableauInitial, taille);
        for ( int[] ligne : tableauDecoupe) {
            System.out.println(Arrays.toString(ligne));
        }
    }

    static int[][] decoupage(int[] tableau, int taille) {

        int tailleTableaudecoupage = (tableau.length / taille) + 1;
        int[][] tableauDecoupe = new int[tailleTableaudecoupage][];

        int indiceTableauDecoupe = 0;
        for (int i = 0; i < tableau.length; i+=taille) {
            int tailleSousTableau = i + taille < tableau.length ? taille : tableau.length - i;
            int[] sousTableau = new int[tailleSousTableau];
            for (int j = 0; j < tailleSousTableau; j++) {
                if (i+j >= tableau.length) {
                    break;
                } else {
                    sousTableau[j] =  tableau[i+j];
                }
            }
            tableauDecoupe[indiceTableauDecoupe] = sousTableau;
            indiceTableauDecoupe++;
        }
        return tableauDecoupe;
    }
}
