
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import main.Person;
import main.Pet;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GiveNameToPetCucumber {
    Person person;

    @Given("my new pet")
    public void my_new_pet() {
        // Write code here that turns the phrase above into concrete actions
        person = new Person();
        person.adoptPet();
    }

    @When("I give a name to the pet")
    public void i_give_a_name_to_the_pet() {
        // Write code here that turns the phrase above into concrete actions
        person.giveNameToPet("myaw");
    }

    @Then("its name is equal to the given name")
    public void its_name_is_equal_to_the_given_name() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("myaw", person.getPet().getName());
    }


}
