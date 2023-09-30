package co.com.auto.project.demoblaze.gradle.tasks;

import co.com.auto.project.demoblaze.gradle.userinterfaces.PaginaDemoblaze;
import co.com.auto.project.demoblaze.gradle.utils.AlertsUtility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;

public class Selecionaryagregar implements Task {
    public static Selecionaryagregar productos(){
        return Tasks.instrumented(Selecionaryagregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_CELLPHONE),
                Click.on(PaginaDemoblaze.BTN_ADDTOCART));

                Alert alert = AlertsUtility.waitForAlertToBePresent(actor);

                if (alert != null){
                    alert.accept();
                } else {
                    System.out.println("No se encontró ninguna alerta.");
                }

                actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_HOME),
                        Click.on(PaginaDemoblaze.BTN_LAPTOPS),
                        Click.on(PaginaDemoblaze.BTN_MACBOOK),
                        Click.on(PaginaDemoblaze.BTN_ADDTOCART2));

                Alert alert2 = AlertsUtility.waitForAlertToBePresent(actor);

                if (alert != null){
                    alert.accept();
                } else {
                    System.out.println("No se encontró ninguna alerta.");
                }

                actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_HOME),
                        Click.on(PaginaDemoblaze.BTN_MONITORS),
                        Click.on(PaginaDemoblaze.BTN_MONITOR),
                        Click.on(PaginaDemoblaze.BTN_ADDTOCART3));

                Alert alert3 = AlertsUtility.waitForAlertToBePresent(actor);

        if (alert != null){
            alert.accept();
        } else {
            System.out.println("No se encontró ninguna alerta.");
        }

        actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_CART));

    }
}
