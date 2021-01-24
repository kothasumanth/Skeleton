package stepDefinition;

import cucumberTest.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class sampleSteps {
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
    }

}
