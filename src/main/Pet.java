package main;

/**
 * Décrivez votre classe Pet ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pet
{
    private int age = 1;
    private String color = "";
    private String name = "";
    private Person owner;
    /**
     * Constructeur d'objets de classe Pet
     */
    public Pet()
    {
        // initialisation des variables d'instance

    }

    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setOwner(Person p){
        this.owner = p;
    }
    public Person getOwner(){
        return this.owner;
    }

}
