import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.GodPerson;

import static org.junit.jupiter.api.Assertions.*;

public class GodPersonStepDefs {
    private String name;
    private String feature;
    private GodPerson god;

    @Given("godAttributes")
    public void godattributes() {
        this.name = "Hades";
        this.feature = "death";
    }

    @When("god a une personne en lui")
    public void godAUnePersonneEnLui() {
        this.god = new GodPerson(this.name, this.feature);
    }

    @Then("god peut adpoter un animal")
    public void godPeutAdpoterUnAnimal() {
        this.god.adoptPet();
        this.god.giveNameToPet("bird");
        assertEquals(this.god.getPerson().getPet().getName(), "bird");
    }
}
