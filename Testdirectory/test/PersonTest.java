<<<<<<< HEAD


=======
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
import static org.junit.jupiter.api.Assertions.*;

import main.Person;
import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test HumanTest.
<<<<<<< HEAD
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class PersonTest
{
=======
 */
public class PersonTest {
    
    private Person elon;
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb

    /**
     * Constructeur de la classe-test HumanTest
     */
<<<<<<< HEAD
    public PersonTest()
    {
=======
    public PersonTest() {
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    }

    /**
     * Met en place les engagements.
<<<<<<< HEAD
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {

=======
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() {
        elon = new Person();
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    }

    /**
     * Supprime les engagements
<<<<<<< HEAD
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


=======
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
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
