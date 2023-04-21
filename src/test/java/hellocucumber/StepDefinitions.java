package hellocucumber;

import hellocucumber.nicebank.Account;
import io.cucumber.java.en.*;

import org.javalite.activejdbc.Base;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        if(!Base.hasConnection()) {
            Base.open(
                    "com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost/bank",
                    "myteller",
                    "password"
            );
        }
        // Account account = new Account("1234");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
