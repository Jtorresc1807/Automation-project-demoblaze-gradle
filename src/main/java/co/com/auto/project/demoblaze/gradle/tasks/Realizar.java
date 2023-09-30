package co.com.auto.project.demoblaze.gradle.tasks;

import co.com.auto.project.demoblaze.gradle.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Realizar implements Task {
    public static Realizar pedido(){
        return Tasks.instrumented(Realizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDemoblaze.BTN_PLACEORDER),
                Enter.theValue("Jaime").into(PaginaDemoblaze.TXT_NAME),
                Enter.theValue("Colombia").into(PaginaDemoblaze.TXT_COUNTRY),
                Enter.theValue("Bucaramanchester").into(PaginaDemoblaze.TXT_CITY),
                Enter.theValue("12345").into(PaginaDemoblaze.TXT_NUM_CREDIT_CARD),
                Enter.theValue("10").into(PaginaDemoblaze.TXT_MONTH),
                Enter.theValue("2030").into(PaginaDemoblaze.TXT_YEAR),
                Click.on(PaginaDemoblaze.BTN_PURCHAASE));
    }
}
