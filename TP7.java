package TPRecapitulatifs;

import java.util.Arrays;

public class TP7 {
    public static void main(String[] args) {

        String[] tableauDirection = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int x = 0;
        int y = 0;
        int[] tableauCoordonnees = new int[2];

        for (String direction: tableauDirection) {
            switch (direction) {
                case "haut":
                    y++;
                    break;
                case "bas":
                    y--;
                    break;
                case "gauche":
                    x--;
                    break;
                case "droite":
                    x++;
                    break;
                default:
                    break;
            }
        }
        tableauCoordonnees[0] = x;
        tableauCoordonnees[1] = y;
        System.out.println("point final: " + Arrays.toString(tableauCoordonnees));
    }
}
