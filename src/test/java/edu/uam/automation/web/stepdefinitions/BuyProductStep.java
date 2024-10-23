package edu.uam.automation.web.stepdefinitions;

import edu.uam.automation.web.tasks.Login;
import edu.uam.automation.web.tasks.NavigateTo;
import edu.uam.automation.web.tasks.SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;


public class BuyProductStep {

    @Given("{actor} is going to buy a product")
    public void actorIsGoingToBuyAProduct(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theSearchHomePage()
        );
    }

    @When("{actor} selects the product")
    public void actorselectsProduct(Actor actor) {
        actor.attemptsTo(
                Login.with("cesar.agudelo.h@gmail.com","123456"),
                SearchProduct.by("smart")
        );
    }

    @Then("{actor} should see the purchase was successful")
    public void actorShouldSeeThePurchaseWasSuccessful(Actor actor) throws InterruptedException {
        Thread.sleep(5000);
        actor.should(

        );
    }

}
