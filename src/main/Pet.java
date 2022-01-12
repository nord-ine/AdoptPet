package main;

/**
<<<<<<< HEAD
 * Décrivez votre classe Pet ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pet
{
=======
 * Ma classe Pet represente un animal
 */
public class Pet {

>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    private int age = 1;
    private String color = "";
    private String name = "";
    private Person owner;
<<<<<<< HEAD
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
=======

    /**
     * Constructeur d'objets de classe Pet
     */
    public Pet() {
        // initialisation des variables d'instance
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        return this.name;
    }


<<<<<<< HEAD
    public void setOwner(Person p){
        this.owner = p;
    }
    public Person getOwner(){
=======
    public void setOwner(Person p) {
        this.owner = p;
    }

    public Person getOwner() {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        return this.owner;
    }

}
