package main;

public class PersonBeliever extends Person {

    private GreekGod god;

    public PersonBeliever() {
        super();
        this.god = null;
    }

    public void setGod(GreekGod god) {
        this.god = god;
    }


    public GreekGod getGod() {
        return this.god;
    }
}
