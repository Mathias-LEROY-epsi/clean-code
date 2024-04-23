package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.ajouterAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE"));
        zoo.ajouterAnimal(new Animal("Boa constrictor", "SERPENT", "CARNIVORE"));
        zoo.ajouterAnimal(new Animal("Python", "SERPENT", "CARNIVORE"));
    }

}
