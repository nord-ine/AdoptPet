import static org.junit.jupiter.api.Assertions.*;

import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test PetTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class PetTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test PetTest
     */
    public PetTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testSetAge()
    {
        Pet cat = new Pet();
        cat.setAge(3);
        assertEquals(3, cat.getAge());
    }


    @Test
    public void testSetName()
    {
        Pet cat = new Pet();
        cat.setName("myaww");
        assertEquals("myaww", cat.getName());
    }
}
