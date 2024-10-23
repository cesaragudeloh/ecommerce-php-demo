package edu.uam.automation.web.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PROCCED_TO_CHECKOUT = Target.the("Procced to checkout button").locatedBy("//a[text()='Proceed to Checkout']");
    public static final Target PAYMENT_METHOD = Target.the("Payment method").locatedBy("//span[@id='select2-advFieldsStatus-container']");
    public static final Target PAYMENT_OPTION = Target.the("Payment option").locatedBy("//li[text()='{0}']");


}
