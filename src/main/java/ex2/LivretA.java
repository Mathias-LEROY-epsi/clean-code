package ex2;

public class LivretA extends CompteBancaire {

    private double tauxRemuneration;
    private static final double DECOUVERT_AUTORISE = 0;
    private static final double POURCENTAGE_REMUNERATION = 100;

    public LivretA(TypeCompte type, double solde, double tauxRemuneration) {
        super(type, solde, DECOUVERT_AUTORISE);
        this.tauxRemuneration = tauxRemuneration;
    }

    public void appliquerRemunerationAnnuelle() {
        double remuneration = getSolde() * tauxRemuneration / POURCENTAGE_REMUNERATION;
        setSolde(getSolde() + remuneration);
    }
}