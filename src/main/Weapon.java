package main;

<<<<<<< HEAD

public class Weapon {
=======
/**
 * Ma classe represente une arme
 */
public class Weapon {

>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    private String name;
    private GreekGod god;

    /**
     * Constructeur d'objets de classe Weapon
     */
<<<<<<< HEAD
    public Weapon(String name)
    {
=======
    public Weapon(String name) {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        // initialisation des variables d'instance
        this.setName(name);
        this.god = null;
    }
<<<<<<< HEAD
    
    public GreekGod getGod() {
    	return this.god;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGod(GreekGod god) throws Exception{
    	if (this.god == null)
    	{
    		this.god = god;
    	}
    	else {
    		throw new MyAssociationException();
    	}
=======

    public GreekGod getGod() {
        return this.god;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGod(GreekGod god) throws Exception {
        if (this.god == null) {
            this.god = god;
        } else {
            throw new MyAssociationException();
        }
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    }

}
