package main;

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
}
