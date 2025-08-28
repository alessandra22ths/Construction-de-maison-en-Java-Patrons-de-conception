public class ToitHandler extends StepHandler {

    @Override
    protected boolean peutGérer(Maison maison) {
        return maison.aMurs();
    }

    @Override
    protected void exécuter(Maison maison) {
        maison.setToit(true);
        System.out.println("Toit installé");
    }
}