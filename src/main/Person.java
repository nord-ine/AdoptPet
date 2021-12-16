package main;

/**
 * Décrivez votre classe Human ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Person
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    private Pet myPet;

    /**
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

