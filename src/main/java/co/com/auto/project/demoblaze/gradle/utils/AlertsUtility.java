package co.com.auto.project.demoblaze.gradle.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsUtility {
    public static Alert waitForAlertToBePresent(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            return driver.switchTo().alert();
        } catch (NoAlertPresentException e) {
            return null;
        }
    }
}
