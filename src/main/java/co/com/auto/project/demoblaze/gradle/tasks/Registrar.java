package co.com.auto.project.demoblaze.gradle.tasks;

import co.com.auto.project.demoblaze.gradle.userinterfaces.PaginaDemoblaze;
import co.com.auto.project.demoblaze.gradle.utils.AlertsUtility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Alert;

public class Registrar implements Task {
    public static Registrar credenciales(){
        return Tasks.instrumented(Registrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_SIGNUP),
                        Enter.theValue("Matias7").into(PaginaDemoblaze.TXT_USUARIO),
                Enter.theValue("123456").into(PaginaDemoblaze.TXT_CLAVE),
                Click.on(PaginaDemoblaze.BTN_SIGN_UP));

        // Esperar a que aparezca la alerta
                Alert alert = AlertsUtility.waitForAlertToBePresent(actor);

        // Manejar la alerta si está presente
                if(alert != null){
                    alert.accept();
                } else {
                    System.out.println("No se encontró ninguna alerta.");
                }
    }
}