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
