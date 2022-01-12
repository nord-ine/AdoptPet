package main;

/**
<<<<<<< HEAD
 * Décrivez votre classe Human ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Person {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
=======
 * Ma classe Person represente un humain
 */
public class Person {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb

    private Pet myPet;

    /**
<<<<<<< HEAD
     * Constructeur d'objets de classe Human
     */
    public Person()
    {
        // initialisation des variables d'instance
        
    }

    public void adoptPet(){
        this.myPet= new Pet();
        this.myPet.setOwner(this);
    }

    public Pet getPet(){
        return this.myPet;
    }
    public void giveNameToPet(String name){
        this.myPet.setName(name);
    }
}

=======
     * Constructeur d'objets de classe Person
     */
    public Person() {
        // initialisation des variables d'instance
    }

    public void adoptPet() {
        this.myPet = new Pet();
        this.myPet.setOwner(this);
    }

    public Pet getPet() {
        return this.myPet;
    }

    public void giveNameToPet(String name) {
        this.myPet.setName(name);
    }
}
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
