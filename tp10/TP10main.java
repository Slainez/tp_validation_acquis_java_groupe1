package TPRecapitulatifs.tp10;

import java.util.ArrayList;
import java.util.Scanner;

public class TP10main {
    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();

        Article article1 = new Article(1, "robinet", 123, 34);
        Article article2 = new Article(2, "setTable", 12, 145);
        Article article3 = new Article(3, "ballonFoot", 45, 3);

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        Program program = new Program(articles);
        boolean quitter = true;

        while (quitter) {
            Scanner input = new Scanner(System.in);
            System.out.println("Faites un choix dans le menu: ");
            System.out.println("1. recherche par référence");
            System.out.println("2. ajouter un article");
            System.out.println("3. supprimer un article");
            System.out.println("4. modifier un article");
            System.out.println("5. rechercher par nom");
            System.out.println("6. rechercher par intervalle de prix");
            System.out.println("7. afficher les articles");
            System.out.println("8. quitter");
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
                    System.out.println("Entrer l'identifiant: ");
                    int id  = input.nextInt();
                    input.nextLine();
                    System.out.println(("Entrer le nom: "));
                    String nom = input.nextLine();
                    System.out.println("Entrez le prix: ");
                    double prix = input.nextDouble();
                    input.nextLine();
                    System.out.println("Entrez le stock: ");
                    int stock = input.nextInt();
                    try {
                        program.ajouterArticle(new Article(id, nom, prix, stock));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    } finally {
                        System.out.println("Article déjà existant");
                        continue;
                    }
                }
                case 3 -> {
                    System.out.print("entrer la référence: ");
                    int refArticle = input.nextInt();
                    program.supprimerArticle(refArticle);
                }
                case 4 -> {
                    System.out.println("Entrer la ref de l'article à modifier: ");
                    int id = input.nextInt();
                    program.modifier(id);
                }
                case 5 -> {
                    System.out.print("Entrer un nom: ");
                    String nom = input.nextLine();
                    System.out.println(program.rechercheParNom(nom));
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

                case 8 -> quitter = false;
            }
        }
    }


    static Article rentrerArticle(Article articles) {
        Scanner input = new Scanner(System.in);
        // while
        System.out.print("Entrer la référence: ");
        int ref = input.nextInt();
        // verifier si la ref n'existe pas déjà
        //input.nextLine();
        System.out.print("Entrer le nom: ");
        String nom = input.nextLine();
        System.out.print("Entrer le prix: ");
        int prix = input.nextInt();
        input.nextLine();
        System.out.print("Entrer le stock: ");
        int stock = input.nextInt();
        return new Article(ref, nom, prix, stock);
    }


}
