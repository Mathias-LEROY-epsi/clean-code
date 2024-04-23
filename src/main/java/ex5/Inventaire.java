package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    public void ajouterUnObjet(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.peutAccepter(item)) {
                caisse.getItems().add(item);
            }
        }
    }

    public int taille() {
        int tailleTotale = 0;
        for (Caisse caisse : caisses) {
            tailleTotale += caisse.getItems().size();
        }
        return tailleTotale;
    }
}
