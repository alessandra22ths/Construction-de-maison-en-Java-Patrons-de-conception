public class FondationHandler extends StepHandler {

    @Override
    protected boolean peutGérer(Maison maison) {
        // Toujours vrai pour commencer la construction
        return true;
    }

    @Override
    protected void exécuter(Maison maison) {
        maison.setFondation(true);
        System.out.println("Fondation posée.");
    }
}