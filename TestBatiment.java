package TPRecapitulatifs;

public class TestBatiment {
    public static void main(String[] args) {

        Maison maison1 = new Maison(5);
        Maison maison2 = new Maison("37 allée Mgr Baumier", 12);

        System.out.println(maison1);
        System.out.println(maison2);
    }
}
