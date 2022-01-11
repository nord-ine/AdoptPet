import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.GreekGod;
import main.MyAssociationException;
import main.Weapon;

import static org.junit.jupiter.api.Assertions.*;

public class AssociationStepDefs {
    private GreekGod god1;
    private GreekGod god2;
    private Weapon weapon;

    @Given("god1 god2 weapon")
    public void god1_god2_weapon() {
        this.god1 = new GreekGod("Hades", "death");
        this.god2 = new GreekGod("Zeus", "sky");
        this.weapon = new Weapon("eternal spear");
    }

    @When("attribution de weapon a god1")
    public void attribution_de_weapon_a_god1() throws Exception {
        this.god1.setWeapon(this.weapon);
    }

    @Then("weapon est associe a god1")
    public void weapon_est_associe_a_god1() {
        assertEquals(this.weapon, this.god1.getWeapon());
    }

    @Then("weapon peut pas etre associe a god2")
    public void weapon_peut_pas_etre_associe_a_god2() throws Exception {
        try {
            this.god2.setWeapon(this.weapon);
            fail();
        } catch (MyAssociationException e) {
            assertNull(this.god2.getWeapon());
            assertEquals(e.getMessage(), "Weapon and God cannot be associated");
        }
    }

    @Then("new weapon peut pas etre associe a god1")
    public void new_weapon_peut_pas_etre_associe_a_god1() throws Exception {
        try {
            this.god1.setWeapon(new Weapon("axe"));
            fail();
        } catch (MyAssociationException e) {
            assertEquals(this.god1.getWeapon(), this.weapon);
        }
    }
}
