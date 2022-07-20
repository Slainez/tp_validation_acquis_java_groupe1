package TPRecapitulatifs;

public class TestVehicules {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("1998", 40000);
        Voiture voiture2 = new Voiture("2000", 50000);

        Camion camion1 = new Camion("2010", 30000);
        Camion camion2 = new Camion("2022", 500000);

        System.out.println("la liste de véhicules: ");
        System.out.println(voiture1.toString());
        System.out.println(voiture2.toString());
        System.out.println(camion1.toString());
        System.out.println(camion2.toString());
    }
}
