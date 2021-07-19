package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CocktailSteps {
    private Order order;

    @Given("^Mr Pignon who wants to buy a drink$")
    public void mr_pignon_who_wants_to_buy_a_drink() throws Throwable {
        order = new Order();
        order.declareOwner("Romeo");
    }

    @When("^an order is declared for Mr Leblanc$")
    public void an_order_is_declared_for_mr_leblanc() throws Throwable {
        order.declareTarget("Juliette");
    }
    @Then("^there is no cocktail in the order$") public void there_is_no_cocktail_in_the_order() throws Throwable {
        List<String> cocktails = order.getCocktails();
        assertEquals(0, cocktails.size());
    }
}
