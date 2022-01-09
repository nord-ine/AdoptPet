import static org.junit.jupiter.api.Assertions.*;

import main.Person;
import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test HumanTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public class PersonTest
{

    /**
     * Constructeur de la classe-test HumanTest
     */
    public PersonTest()
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
    public void testGiveNametoPet()
    {
        //Pet shibainu = new Pet();
        Person elon = new Person();
        elon.adoptPet();
        elon.giveNameToPet("doge");
        assertEquals("doge", elon.getPet().getName());
    }
}