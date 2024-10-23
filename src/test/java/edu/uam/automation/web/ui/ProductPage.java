package edu.uam.automation.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target ADD_TO_CART_1 = Target.the("Add to cart button").locatedBy("//a[text()='Add to Cart']");
    public static final Target ADD_TO_CART_2 = Target.the("Add to cart button").located(By.name("form_add_to_cart"));
    public static final Target SUSCRIBE_BUTTON = Target.the("Sucribe button").located(By.name("form_subscribe"));



}
