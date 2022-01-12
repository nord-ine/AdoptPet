<<<<<<< HEAD
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
=======
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
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
