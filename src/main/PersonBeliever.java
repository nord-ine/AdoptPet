package main;

public class PersonBeliever extends Person{



    private GreekGod god;

    public PersonBeliever(){

    }

    public void setGod(GreekGod god) {
        this.god = god;
    }


    public GreekGod getGod() {
        return this.god;
    }
}
