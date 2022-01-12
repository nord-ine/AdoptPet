package main;

/**
 * Ma classe Pet represente un animal
 */
public class Pet {

    private int age = 1;
    private String type = "";
    private String name = "";
    private Person owner;

    /**
     * Constructeur d'objets de classe Pet
     */
    public Pet() {
        // initialisation des variables d'instance
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setOwner(Person p) {
        this.owner = p;
    }

    public Person getOwner() {
        return this.owner;
    }

}
