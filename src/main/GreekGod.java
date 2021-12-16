package main;


public class GreekGod {
	
    private String name;
    private String feature;
    private Weapon weapon;

    /**
     * Constructeur d'objets de classe GreekGod
     */
    public GreekGod(String name, String feature)
    {
        // initialisation des variables d'instance
        this.setName(name);
        this.setFeature(feature);
        this.weapon = null;
    }
    
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
        return "I am " + getName() + ", the god of " + getFeature();
    }

}
