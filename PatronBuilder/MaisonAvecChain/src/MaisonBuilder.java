public class MaisonBuilder {
    public Maison construireMaison() {
        Maison maison = new Maison();

        StepHandler fondation = new FondationHandler();
        StepHandler murs = new MurHandler();
        StepHandler toit = new ToitHandler();

        fondation.définirSuivant(murs);
        murs.définirSuivant(toit);

        fondation.gérerÉtape(maison);

        return maison;
    }
}