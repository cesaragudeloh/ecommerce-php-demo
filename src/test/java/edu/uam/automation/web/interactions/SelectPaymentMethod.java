package edu.uam.automation.web.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static edu.uam.automation.web.ui.CartPage.PAYMENT_METHOD;
import static edu.uam.automation.web.ui.CartPage.PAYMENT_OPTION;

public class SelectPaymentMethod implements Interaction {


    private String option;

    public SelectPaymentMethod(String option) {

        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PAYMENT_METHOD),
                Click.on(PAYMENT_OPTION.of(option))
        );
    }


    public static SelectPaymentMethod with( String option) {
        return Instrumented.instanceOf(SelectPaymentMethod.class).withProperties(option);
    }

}
