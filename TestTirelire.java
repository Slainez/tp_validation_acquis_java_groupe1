package TPRecapitulatifs;

import java.util.Scanner;

public class TestTirelire {
    public static void main(String[] args) {
        Tirelire tirelire = new Tirelire();
        Scanner input = new Scanner(System.in);

        System.out.println(tirelire.afficher());
        System.out.println(tirelire.secouer());
        tirelire.remplir(45.4);
        System.out.println(tirelire.afficher());
        System.out.println(tirelire.secouer());
        tirelire.vider();
        System.out.println(tirelire.afficher());
        System.out.println(tirelire.getMontant());
        tirelire.remplir(1245.45);
        System.out.println(tirelire.afficher());
        tirelire.puiser(0.45);
        System.out.println(tirelire.afficher());
        System.out.print("donner le budget de vos vacances:");
        double budget = input.nextDouble();
        input.nextLine();
        System.out.println(tirelire.calculerSolde(budget));
    }
}
