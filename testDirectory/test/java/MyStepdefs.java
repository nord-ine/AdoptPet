import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.GreekGod;

import static org.junit.jupiter.api.Assertions.*;

public class MyStepdefs {
    private GreekGod god;
    private String name;
    private String feature;

    @Given("name et feature")
    public void name_et_feature() {
        this.name = "Hades";
        this.feature = "death";
    }

    @When("instanciation")
    public void instanciation() {
        this.god = new GreekGod(this.name, this.feature);
    }

    @Then("creation du dieu avec name et feature")
    public void creation_du_dieu_avec_name_et_feature() {
        assertEquals(this.name, this.god.getName());
        System.out.println();
        assertEquals(this.feature, this.god.getFeature());
    }
}

