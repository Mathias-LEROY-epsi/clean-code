package ex2;

/**
 * Représente un compte bancaire de type compte courante ou livret A
 */
public class CompteBancaire {

    private double solde;
    private double decouvert;
    private TypeCompte typeDeCompte;

    public CompteBancaire(TypeCompte type, double solde, double decouvert) {
        this.typeDeCompte = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    public void debiterMontant(double montant) {
        double nouveauSolde = solde - montant;
        if ((TypeCompte.COMPTE_COURANT.equals(typeDeCompte) && nouveauSolde > decouvert)
                || (TypeCompte.LIVRET_A.equals(typeDeCompte) && nouveauSolde > 0)) {
            solde = nouveauSolde;
        }
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public TypeCompte getTypeDeCompte() {
        return typeDeCompte;
    }

    public void setTypeDeCompte(TypeCompte typeDeCompte) {
        this.typeDeCompte = typeDeCompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}