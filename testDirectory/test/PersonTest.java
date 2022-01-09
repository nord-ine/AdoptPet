import static org.junit.jupiter.api.Assertions.*;

import main.Person;
import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test HumanTest.
 */
public class PersonTest {
    
    private Person elon;

    /**
     * Constructeur de la classe-test HumanTest
     */
    public PersonTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() {
        elon = new Person();
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void testGiveNametoPet() {
        this.elon.adoptPet();
        this.elon.giveNameToPet("doge");
        assertEquals("doge", this.elon.getPet().getName());
    }
}