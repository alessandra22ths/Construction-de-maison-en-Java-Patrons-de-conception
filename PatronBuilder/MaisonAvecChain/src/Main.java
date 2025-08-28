public class Main {
    public static void main(String[] args) {
        MaisonBuilder builder = new MaisonBuilder();
        Maison maison = builder.construireMaison();

        System.out.println("\nRésumé de la maison :");
        System.out.println("Fondation : " + maison.aFondation());
        System.out.println("Murs      : " + maison.aMurs());
        System.out.println("Toit      : " + maison.aToit());
    }
}