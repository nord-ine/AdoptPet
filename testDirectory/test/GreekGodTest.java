import static org.junit.jupiter.api.Assertions.*;

import main.GreekGod;
import main.MyAssociationException;
import main.Weapon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreekGodTest {

    private GreekGod god;
    private GreekGod god2;
    private Weapon weapon;
    
    /**
     * Constructeur de la classe-test GreekGodTest
     */
    public GreekGodTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
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
        }

    }

	public void assertAssociationGodWeapon() {
		assertEquals(god.getWeapon(), weapon);
        assertEquals(weapon.getGod(), god);
	}
}
