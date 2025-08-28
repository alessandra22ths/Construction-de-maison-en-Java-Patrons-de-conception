public class Maison {
    private boolean fondation = false;
    private boolean murs = false;
    private boolean toit = false;

    public void setFondation(boolean fondation) { this.fondation = fondation; }
    public void setMurs(boolean murs) { this.murs = murs; }
    public void setToit(boolean toit) { this.toit = toit; }

    public boolean aFondation() { return fondation; }
    public boolean aMurs() { return murs; }
    public boolean aToit() { return toit; }
}