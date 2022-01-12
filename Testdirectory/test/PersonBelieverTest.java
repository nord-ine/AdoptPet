<<<<<<< HEAD


import static org.junit.jupiter.api.Assertions.*;

import main.GreekGod;
import main.Person;
import main.PersonBeliever;
import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonBelieverTest
{
    private PersonBeliever person;
    private GreekGod god;

    /**
     * Constructeur de la classe-test HumanTest
     */
    public PersonBelieverTest()
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
        this.person = new PersonBeliever();
        this.god = new GreekGod("zeus","foudre");
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        this.person = null;
        this.god = null;
    }



    @Test
    public void testGetGod()
    {
        PersonBeliever person = new PersonBeliever();
        assertEquals(null, person.getGod());
    }

    @Test
    public void testSetGod()
    {
        this.person.setGod(god);
        assertEqualsGod();
    }

    public void assertEqualsGod() {

        assertEquals("zeus", person.getGod().getName());
        assertEquals("foudre", person.getGod().getFeature());
        assertEquals(null, person.getGod().getWeapon());
    }


}


=======
import static org.junit.jupiter.api.Assertions.*;

import main.GreekGod;
import main.PersonBeliever;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonBelieverTest {
    private PersonBeliever person;
    private GreekGod god;

    /**
     * Constructeur de la classe-test HumanTest
     */
    public PersonBelieverTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        this.person = new PersonBeliever();
        this.god = new GreekGod("zeus", "foudre");
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        this.person = null;
        this.god = null;
    }


    @Test
    public void testGetGod() {
        assertNull(this.person.getGod());
    }

    @Test
    public void testSetGod() {
        this.person.setGod(this.god);
        assertEqualsGod();
        this.person.setGod(null);
        assertNull(this.person.getGod());
    }

    public void assertEqualsGod() {

        assertEquals("zeus", this.person.getGod().getName());
        assertEquals("foudre", this.person.getGod().getFeature());
        assertEquals(null, this.person.getGod().getWeapon());
    }

    @Test
    public void testGetPet() {
        assertNull(this.person.getPet());
    }
}
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
