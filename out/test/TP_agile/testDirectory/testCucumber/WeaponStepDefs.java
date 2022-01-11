import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Weapon;

import static org.junit.jupiter.api.Assertions.*;

public class WeaponStepDefs {
    private String name;
    private Weapon weapon;

    @Given("name")
    public void name() {
        this.name = "eternal spear";
    }

    @When("instanciation")
    public void instanciation() {
        this.weapon = new Weapon(this.name);
    }

    @Then("creation arme avec name")
    public void creationArmeAvecName() {
        assertEquals(this.name, this.weapon.getName());
    }
}
