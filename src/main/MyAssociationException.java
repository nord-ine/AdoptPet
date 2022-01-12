package main;

<<<<<<< HEAD
public class MyAssociationException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyAssociationException() {
		super();
	}
	
	public String getMessage() {
		return "Weapon has already a God";
	}
=======
/**
 * Ma classe MyAssociationException est utilise pour
 * caracteriser les erreurs d'association entre un dieu grec
 * et une arme.
 */
public class MyAssociationException extends Exception {

    private static final long serialVersionUID = 1L;

    public MyAssociationException() {
        super();
    }

    public String getMessage() {
        return "Weapon and God cannot be associated";
    }
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
}
