package TPRecapitulatifs;

import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {

        int[][] matrice = {
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}
        };

        int nombreRecherche = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Rentrez le nombre à rechercher:");
        nombreRecherche = input.nextInt();

        System.out.println(nombreIn2D(matrice, nombreRecherche));


    }
    static String nombreIn2D(int[][] matrice, int nombre) {
        String positions = "";
        int counter = 0;
        for (int i = 0; i < matrice.length; i ++) {
            for (int j = 0; j < matrice[i].length; j ++) {
                if (matrice[i][j] == nombre) {
                    counter++;
                    positions += "(" + i + "," + j + ")";
                }
            }
        }
        return String.format("Le nombre %d se trouve %d fois dans la matrice:\n%s", nombre, counter, positions);
    }
}
