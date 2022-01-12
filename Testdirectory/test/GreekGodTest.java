import static org.junit.jupiter.api.Assertions.*;

import main.GreekGod;
import main.MyAssociationException;
import main.Weapon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test GreekGodTest.
 */
class GreekGodTest {

    private GreekGod god;
    private GreekGod god2;
    private Weapon weapon;

    /**
     * Constructeur de la classe-test GreekGodTest
     */
    public GreekGodTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Methode appelee avant chaque appel de methode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        god = new GreekGod("Hades", "death");
        god2 = new GreekGod("Hermes", "messages");
        weapon = new Weapon("eternal spear");
    }

    /**
     * Supprime les engagements
     * <p>
     * Methode appelee apres chaque appel de methode de test.
     */
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testToString() {
        assertPresentationGod();
    }

    public void assertPresentationGod() {
        assertTrue(this.god.toString().contains(this.god.getName()));
        assertTrue(this.god.toString().contains(this.god.getFeature()));
    }

    @Test
    public void testGetName() {
        assertEquals("Hades", this.god.getName());
    }

    @Test
    public void testSetWeapon() throws Exception {
        assertEquals(this.god.getWeapon(), null);
        this.god.setWeapon(this.weapon);
        assertAssociationGodWeapon();

        try {
            this.weapon.setGod(this.god2);
            fail();
        } catch (MyAssociationException e) {
            assertEquals(this.weapon, this.god.getWeapon());
        }

        try {
            this.god2.setWeapon(this.weapon);
            fail();
        } catch (MyAssociationException e) {
            assertNull(this.god2.getWeapon());
            assertEquals(e.getMessage(), "Weapon and God cannot be associated");
        }

    }

    public void assertAssociationGodWeapon() {
        assertEquals(this.god.getWeapon().getName(), this.weapon.getName());
        assertEquals(this.weapon.getGod(), this.god);
    }
}
