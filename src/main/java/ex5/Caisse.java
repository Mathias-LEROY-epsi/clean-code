package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {
    private String typeItem;
    private List<Item> items;
    private static final int CAPACITE_MAX_PETITS_OBJETS = 5;
    private static final int CAPACITE_MAX_MOYENS_OBJETS = 20;

    public Caisse(String typeItem) {
        this.typeItem = typeItem;
        this.items = new ArrayList<>();
    }

    /**
     * Vérifie si la caisse peut accepter l'objet en fonction de son poids
     *
     * @param item l'objet à vérifier
     * @return true si la caisse peut accepter l'objet, false sinon
     */
    public boolean peutAccepter(Item item) {
        return switch (typeItem) {
            case "Petits objets" -> item.getPoids() < CAPACITE_MAX_PETITS_OBJETS;
            case "Moyens objets" ->
                    item.getPoids() >= CAPACITE_MAX_PETITS_OBJETS && item.getPoids() <= CAPACITE_MAX_MOYENS_OBJETS;
            case "Grands objets" -> item.getPoids() >= CAPACITE_MAX_MOYENS_OBJETS;
            default -> false;
        };
    }

    public List<Item> getItems() {
        return items;
    }
}
