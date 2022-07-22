package TPRecapitulatifs.tp10;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    ArrayList<Article> articles = new ArrayList<>();

    public Program(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public String rechercheParRef(int id) {
        for (Article article : articles) {
            if (article.getId() == id) {
                return article.toString();
            }
        }
        return null;
    }



    public void ajouterArticle(Article article) throws Exception {
        for (Article art : articles) {
            if (art.getId() == article.getId()) {
                throw new Exception();
            } else {
                articles.add(article);
            }
        }
    }

    public void supprimerArticle(int id) {
        for (Article article : articles) {
            if (article.getId() == id) {
                articles.remove(article);
            }
        }
    }

    public Article rechercheParNom(String nom) {
        for (Article article : articles) {
            if (article.getNom().equals(nom)) {
                return article;
            }
        }
        return null;
    }

    public Article rechercheIntervalles(double prixMin, double prixMax) {
        for (Article article : articles) {
            if (article.getPrix() >= prixMin && article.getPrix() <= prixMax) {
                return article;
            }
        }
        return null;
    }

    public void modifier(int id) {
        Scanner input = new Scanner(System.in);
        System.out.println("entrer un nom: ");
        var nom = input.nextLine();
        System.out.println("Entrer le prix: ");
        var prix =input.nextDouble();
        System.out.println("Entrer un stock: ");
        var stock = input.nextInt();
        articles.set(id, new Article(id, nom, prix, stock));
    }

    public void affichage() {
        for (Article article : articles) {
            System.out.println(article.toString());
        }
    }
}
