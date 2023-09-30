package co.com.auto.project.demoblaze.gradle.questions;

import co.com.auto.project.demoblaze.gradle.userinterfaces.PaginaDemoblaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Verificar implements Question {
    public static Verificar ingreso(){
        return new Verificar();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= PaginaDemoblaze.LBL_WELCOME.resolveFor(actor).getText().equals("Welcome Matias7");
        return compare;
    }
}
