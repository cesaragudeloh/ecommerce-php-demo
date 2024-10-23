package edu.uam.automation.web.tasks;

import edu.uam.automation.web.interactions.ClickJS;
import edu.uam.automation.web.interactions.SelectPaymentMethod;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static edu.uam.automation.web.ui.CartPage.*;
import static edu.uam.automation.web.ui.HomePage.*;
import static edu.uam.automation.web.ui.ProductPage.*;

public class SearchProduct implements Task {

    private String productName;

    public SearchProduct(String productName) {
        this.productName = productName;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(productName).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON),
                Click.on(ADD_TO_CART_1),
                Click.on(ADD_TO_CART_2),
                Click.on(ADD_TO_CART_OPTION),
                ClickJS.onTarget(PROCCED_TO_CHECKOUT),
                //Scroll.to(SUSCRIBE_BUTTON),
                //Click.on(PROCCED_TO_CHECKOUT)
                SelectPaymentMethod.with("Bank Deposit")
        );
    }


    public static SearchProduct by(String productName) {
        return Instrumented.instanceOf(SearchProduct.class).withProperties(productName);
    }
}
