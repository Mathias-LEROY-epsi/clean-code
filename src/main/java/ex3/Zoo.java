package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Zoo {

    private String nom;
    private final List<Animal> animaux;
    Logger logger = Logger.getLogger(getClass().getName());

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        if (animaux.isEmpty()) {
            logger.info("Il n'y a pas d'animaux dans le zoo");
            return;
        }
        for (Animal animal : animaux) {
            logger.info(animal.toString());
        }
    }

    public int getNombreAnimaux() {
        return animaux.size();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
