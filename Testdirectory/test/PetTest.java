<<<<<<< HEAD


=======
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
import static org.junit.jupiter.api.Assertions.*;

import main.Pet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test PetTest.
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
public class PetTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;
=======
 */
public class PetTest {

    private Pet cat;
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb

    /**
     * Constructeur de la classe-test PetTest
     */
<<<<<<< HEAD
    public PetTest()
    {
=======
    public PetTest() {
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
        // Initialisez ici vos engagements
        fValeur1= 2.0;
        fValeur2= 3.0;
=======
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() {
        cat = new Pet();
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
    public void testSetAge()
    {
        Pet cat = new Pet();
        cat.setAge(3);
        assertEquals(3, cat.getAge());
=======
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
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    }


    @Test
<<<<<<< HEAD
    public void testSetName()
    {
        Pet cat = new Pet();
        cat.setName("myaww");
        assertEquals("myaww", cat.getName());
    }
}



=======
    public void testSetName() {
        this.cat.setName("myaww");
        assertEquals("myaww", this.cat.getName());
    }
}
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
