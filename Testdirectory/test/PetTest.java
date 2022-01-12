import static org.junit.jupiter.api.Assertions.*;

import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test PetTest.
 */
public class PetTest {

    private Pet cat;

    /**
     * Constructeur de la classe-test PetTest
     */
    public PetTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() {
        cat = new Pet();
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
    public void testSetAge() {
        this.cat.setAge(3);
        assertEquals(3, this.cat.getAge());
    }


    @Test
    public void testSetName() {
        this.cat.setName("myaww");
        assertEquals("myaww", this.cat.getName());
    }
}
