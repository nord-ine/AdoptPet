import static org.junit.jupiter.api.Assertions.*;

import main.GreekGod;
import main.MyAssociationException;
import main.Weapon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
=======
/**
 * Classe-test GreekGodTest.
 */
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
class GreekGodTest {

    private GreekGod god;
    private GreekGod god2;
    private Weapon weapon;
<<<<<<< HEAD
    
    /**
     * Constructeur de la classe-test GreekGodTest
     */
    public GreekGodTest()
    {
=======

    /**
     * Constructeur de la classe-test GreekGodTest
     */
    public GreekGodTest() {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    }

    /**
     * Met en place les engagements.
<<<<<<< HEAD
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
=======
     * <p>
     * Methode appelee avant chaque appel de methode de test.
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
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
<<<<<<< HEAD
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
    }

    @Test
    public void testToString()
    {
    	assertPresentationGod();
    }

	public void assertPresentationGod() {
		assertTrue(god.toString().contains(god.getName()));
    	assertTrue(god.toString().contains(god.getFeature()));
	}
    
    @Test
    public void testGetName()
    {
        assertEquals("Hades", god.getName());
    }
    
    @Test
    public void testSetName()
    {
        assertEquals("Hades", god.getName());
    }
    
    @Test
    public void testSetWeapon() throws Exception
    {
    	assertEquals(god.getWeapon(), null);
        god.setWeapon(weapon);
        assertAssociationGodWeapon();
        
        try {
        	god2.setWeapon(weapon);
        	fail();
        }
        catch (MyAssociationException e) {
            assertTrue(true);
=======
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
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
        }

    }

<<<<<<< HEAD
	public void assertAssociationGodWeapon() {
		assertEquals(god.getWeapon(), weapon);
        assertEquals(weapon.getGod(), god);
	}
=======
    public void assertAssociationGodWeapon() {
        assertEquals(this.god.getWeapon().getName(), this.weapon.getName());
        assertEquals(this.weapon.getGod(), this.god);
    }
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
}
