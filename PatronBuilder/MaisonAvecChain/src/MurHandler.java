public class MurHandler extends StepHandler {

    @Override
    protected boolean peutGérer(Maison maison) {
        return maison.aFondation();
    }

    @Override
    protected void exécuter(Maison maison) {
        maison.setMurs(true);
        System.out.println("Murs construits");
    }
}