import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.GreekGod;
import main.PersonBeliever;

import static org.junit.jupiter.api.Assertions.*;

public class PersonBelieverStepDefs {
    private PersonBeliever person;
    private GreekGod god;

    @Given("person god")
    public void personGod() {
        this.person = new PersonBeliever();
        this.god = new GreekGod("Hades", "death");
    }

    @When("person croit en god")
    public void personCroitEnGod() {
        this.person.setGod(this.god);
    }

    @Then("person est associe a god")
    public void personEstAssocieAGod() {
        assertEquals(this.person.getGod(), this.god);
    }

    @When("person croit plus en god")
    public void personCroitPlusEnGod() {
        this.person.setGod(null);
    }

    @Then("person est associe a aucun dieu")
    public void personEstAssocieAAucunDieu() {
        assertNull(this.person.getGod());
    }
}
