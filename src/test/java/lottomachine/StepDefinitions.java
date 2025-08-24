package lottomachine;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private GlazenBol bol;
    private Lottobal geschepteBal;

    @Given("een glazenbol met een capaciteit van {int}")
    public void eenGlazenbolMetEenCapaciteitVan(int capaciteit) {
        bol = new GlazenBol(capaciteit);
    }

    @When("een bal geschept wordt")
    public void eenBalGescheptWordt() {
        geschepteBal = bol.schepBal();
    }

    @Then("zou het balnummer {int} moeten zijn")
    public void zouHetBalnummerMoetenZijn(int balnummer) {
        assertEquals(balnummer, geschepteBal.getNummer());
    }
}
