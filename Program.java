package TPRecapitulatifs;

import java.util.ArrayList;

public class Program {

    ArrayList<Articles> articles = new ArrayList<>();

    public Program(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public String rechercheParRef(int id) {
        for (Articles article : articles) {
            if (article.getId() == id) {
                return article.toString();
            }
        }
        return null;
    }

    public void ajouterArticle(Articles article) {
        articles.add(article);
    }

    public void supprimerArticle(int id) {
        for (Articles article : articles) {
            if (article.getId() == id) {
                articles.remove(article);
            }
        }
    }

    public void modif() {

    }

    public Articles rechercheParNom(String nom) {
        for (Articles article : articles) {
            if (article.getNom().equals(nom)) {
                return article;
            }
        }
        return null;
    }

    public Articles rechercheIntervalles(double prixMin, double prixMax) {
        for (Articles article : articles) {
            if (article.getPrix() >= prixMin && article.getPrix() <= prixMax) {
                return article;
            }
        }
        return null;
    }

    public void affichage() {
        for (Articles article : articles) {
            System.out.println(article.toString());
        }
    }
}
