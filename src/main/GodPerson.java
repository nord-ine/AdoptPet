<<<<<<< HEAD
package main;

public class GodPerson extends GreekGod {


    private Person person;

    public GodPerson(String name, String feature){
        super(name,feature);
        this.person = new Person();
    }

    public Person getPerson() {
        return this.person;
    }

    public void adoptPet(){
       this.person.adoptPet();
    }


    public void giveNameToPet(String name){
        this.person.giveNameToPet(name);
    }
}
=======
package main;

public class GodPerson extends GreekGod {

    private Person person;

    public GodPerson(String name, String feature) {
        super(name, feature);
        this.person = new Person();
    }

    public Person getPerson() {
        return this.person;
    }

    public void adoptPet() {
        this.person.adoptPet();
    }


    public void giveNameToPet(String name) {
        this.person.giveNameToPet(name);
    }
}
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
