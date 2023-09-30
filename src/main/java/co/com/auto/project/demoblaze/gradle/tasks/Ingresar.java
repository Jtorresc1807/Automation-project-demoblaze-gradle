package co.com.auto.project.demoblaze.gradle.tasks;

import co.com.auto.project.demoblaze.gradle.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar usuarioyclave(){
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_LOGIN1),
                Enter.theValue("Matias7").into(PaginaDemoblaze.TXT_USUARIO_ING),
                Enter.theValue("123456").into(PaginaDemoblaze.TXT_CLAVE_ING),
                Click.on(PaginaDemoblaze.BTN_LOGIN));
    }
}