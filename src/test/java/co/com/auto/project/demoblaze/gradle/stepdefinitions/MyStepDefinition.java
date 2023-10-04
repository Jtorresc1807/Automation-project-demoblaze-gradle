package co.com.auto.project.demoblaze.gradle.stepdefinitions;

import co.com.auto.project.demoblaze.gradle.questions.Verificar;
import co.com.auto.project.demoblaze.gradle.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MyStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("That Jaime enters the page product store")
    public void thatJaimeEntersThePageProductStore() {
        OnStage.theActorCalled("Jaime").wasAbleTo(AbrirPagina.urlApp());
    }

    @When("Register with credentials")
    public void registerWithCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.credenciales());
    }

    @Then("Login with your registration credentials")
    public void loginWithYourRegistrationCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.usuarioyclave());
    }

    @Then("Verify that Sign up successful")
    public void verifyThatSignUpSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.ingreso(),
        Matchers.is(true)));
    }

    @Then("Select cell phones, laptops, monitors and add the products to the cart")
    public void selectCellPhonesLaptopsMonitorsAndAddTheProductsToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(Selecionaryagregar.productos());
    }

    @Then("Place an order and buy the products")
    public void placeAnOrderAndBuyTheProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(Realizar.pedido());
    }

    @Then("^Login with (.*) and (.*)$")
    public void loginWithUserAndPassword(String user, String password) {
        WebDriver driver = getDriver();
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.id("loginusername")).sendKeys(user);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }
}