package main;

<<<<<<< HEAD

public class GreekGod {
	
=======
/**
 * Ma classe GreekGod represente un dieu grec
 */
public class GreekGod {

>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    private String name;
    private String feature;
    private Weapon weapon;

    /**
     * Constructeur d'objets de classe GreekGod
     */
<<<<<<< HEAD
    public GreekGod(String name, String feature)
    {
=======
    public GreekGod(String name, String feature) {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        // initialisation des variables d'instance
        this.setName(name);
        this.setFeature(feature);
        this.weapon = null;
    }
<<<<<<< HEAD
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFeature() {
        return this.feature;
    }
    
    public void setFeature(String feature) {
        this.feature = feature;
    }
    
    public Weapon getWeapon() {
        return this.weapon;
    }
    
    /**
     * Methode pour r�aliser l'association entre un god
     * et une arme
     * @throws Exception 
     */
    public void setWeapon(Weapon weapon) throws Exception {
    	this.weapon = weapon;
    	this.weapon.setGod(this);
    }

    /**
     * Methode pour pr�senter le dieux
     */
    public String toString()
    {
=======

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    /**
     * Methode pour realiser l'association entre un god
     * et une arme
     *
     * @throws Exception
     */
    public void setWeapon(Weapon weapon) throws Exception {
        if (this.getWeapon() == null && weapon.getGod() == null) {
            this.weapon = weapon;
            this.weapon.setGod(this);
        } else {
            throw new MyAssociationException();
        }
    }

    /**
     * Methode pour presenter le dieu
     */
    public String toString() {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        return "I am " + getName() + ", the god of " + getFeature();
    }

}
