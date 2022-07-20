package TPRecapitulatifs;

import java.util.ArrayList;
import java.util.Scanner;

public class TP10 {
    public static void main(String[] args) {
        ArrayList<Articles> articles = new ArrayList<>();

        Articles article1 = new Articles(1, "robinet", 123, 34);
        Articles article2 = new Articles(2, "setTable", 12, 145);
        Articles article3 = new Articles(3, "ballonFoot", 45, 3);

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        Program program = new Program(articles);

        Scanner input = new Scanner(System.in);
        System.out.println("Faites un choix dans le menu: ");
        System.out.println("1. recherche par référence");
        System.out.println("2. ajouter un article");
        System.out.println("3. supprimer un article");
        System.out.println("4. modifier un article");
        System.out.println("5. rechercher par nom");
        System.out.println("6. rechercher par intervalle de prix");
        System.out.println("7. afficher les articles");
        System.out.print("votre choix: ");
        int choixMenu = input.nextInt();
        input.nextLine();

        switch (choixMenu) {
            case 1 -> {
                System.out.print("Entrer la référence: ");
                int ref = input.nextInt();
                System.out.println(program.rechercheParRef(ref));
            }
            case 2 -> {
                System.out.println("Entrez les propriétés de l'article");
                Articles article = rentrerArticle();
                System.out.println("article: " + article.toString());
                articles.add(article);
                program.setArticles(articles);
                System.out.println(program.getArticles());
            }
            case 3 -> {
                System.out.print("entrer la référence: ");
                int refArticle = input.nextInt();
                program.supprimerArticle(refArticle);
            }
            case 4 -> System.out.println("modifier");
            case 5 -> {
                System.out.print("Entrer un nom: ");
                String nom = input.nextLine();
                program.rechercheParNom(nom);
            }
            case 6 -> {
                System.out.print("Entrer l'intervalle inférieur: ");
                double valInf = input.nextDouble();
                input.nextLine();
                System.out.print("Entrer l'intervalle supérieur: ");
                double valSup = input.nextDouble();
                input.nextLine();
                program.rechercheIntervalles(valInf, valSup);
            }
            case 7 -> program.affichage();
        }
    }
    static Articles rentrerArticle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer la référence: ");
        int ref = input.nextInt();
        input.nextLine();
        System.out.print("Entrer le nom: ");
        String nom = input.nextLine();
        System.out.print("Entrer le prix: ");
        int prix = input.nextInt();
        input.nextLine();
        System.out.print("Entrer le stock: ");
        int stock = input.nextInt();
        return new Articles(ref, nom, prix, stock);
    }
}
