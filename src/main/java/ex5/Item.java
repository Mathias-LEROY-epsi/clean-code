package ex5;

public class Item {

    private String nom;
    private int poids;

    public Item(int poids) {
        this.poids = poids;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }
}
