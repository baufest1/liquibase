package hellocucumber;

import hellocucumber.nicebank.Account;
import hellocucumber.nicebank.AtmServer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.javalite.activejdbc.Base;

import java.util.List;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        if(!Base.hasConnection()) {
            Base.open(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost/explorecalifornia2",
                    "californiauser",
                    "ThePassword"
            );
        }

        System.out.printf("successful connection!");

        try {
            new AtmServer(9988).start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
