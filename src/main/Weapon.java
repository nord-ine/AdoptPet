package main;


public class Weapon {
    private String name;
    private GreekGod god;

    /**
     * Constructeur d'objets de classe Weapon
     */
    public Weapon(String name)
    {
        // initialisation des variables d'instance
        this.setName(name);
        this.god = null;
    }
    
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
    }

}
