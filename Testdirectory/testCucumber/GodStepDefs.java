import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.GreekGod;

import static org.junit.jupiter.api.Assertions.*;

public class GodStepDefs {
    private GreekGod god;
    private String name;
    private String feature;
    private String presentation;

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
        assertEquals(this.feature, this.god.getFeature());
    }

    @Given("un dieu")
    public void un_dieu() {
        this.name_et_feature();
        this.instanciation();
    }

    @When("dieu se presente")
    public void dieu_se_presente() {
        this.presentation = this.god.toString();
    }

    @Then("il retourne une phrase contenant son name et son feature")
    public void il_retourne_une_phrase_contenant_son_name_et_son_feature() {
        assertTrue(this.presentation.contains(this.god.getName()));
        assertTrue(this.presentation.contains(this.god.getFeature()));
    }
}

