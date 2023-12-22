package hellocucumber;

import hellocucumber.nicebank.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.javalite.activejdbc.Base;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
        String url = "jdbc:mysql://localhost:3306/nicebank";
        String user = "myTeller";
        String password = "password";

        try {
            Base.open("com.mysql.cj.jdbc.Driver", url, user, password);
        } catch (Exception e) {
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
        }

        Account.findAll()
                .stream().forEach(System.out::println);
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
