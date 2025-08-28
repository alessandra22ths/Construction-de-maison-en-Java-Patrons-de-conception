public abstract class StepHandler {
    protected StepHandler suivant;

    public void définirSuivant(StepHandler suivant) {
        this.suivant = suivant;
    }

    public void gérerÉtape(Maison maison) {
        if (peutGérer(maison)) {
            exécuter(maison);
            if (suivant != null) {
                suivant.gérerÉtape(maison);
            }
        } else {
            System.out.println("Échec à l'étape : " + this.getClass().getSimpleName());
        }
    }

    protected abstract boolean peutGérer(Maison maison);
    protected abstract void exécuter(Maison maison);
}