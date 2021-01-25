package stepDefinition;

import cucumberTest.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.example.App;

public class sampleSteps {
    private static final Logger logger = LogManager.getLogger(sampleSteps.class.getName());
    @Given("i have provided two numbers")
    public void i_have_provided_two_numbers() {
        TestContext.num1 = 4;
        TestContext.num2=5;
    }
    @When("i add them")
    public void i_add_them() {
        TestContext.num3 = TestContext.num1+TestContext.num2;
    }

    @Then("sum should be equal to math")
    public void sum_should_be_equal_to_math() {
        System.out.println(TestContext.num3);
        logger.info("Sum is: " + TestContext.num3);
    }

}
