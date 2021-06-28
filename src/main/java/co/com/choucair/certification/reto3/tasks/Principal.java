package co.com.choucair.certification.reto3.tasks;

import co.com.choucair.certification.reto3.userinterface.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Principal  implements Task {


    public static Principal onPage() {
        return Tasks.instrumented(Principal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrincipalPage.Menu_Producto),
                Click.on(PrincipalPage.Producto_Leasing),
                Click.on(PrincipalPage.Leasing_Habitacional),
                Click.on(PrincipalPage.Simular),
                Click.on(PrincipalPage.Segun_Vivienda),
                Enter.theValue("300000000").into(PrincipalPage.Valor_vivienda),
                Click.on(PrincipalPage.Button_Porcentaje),
                Click.on(PrincipalPage.Porcentaje),
                Enter.theValue("20").into(PrincipalPage.Tiempo),
                Click.on(PrincipalPage.Fecha),
                Click.on(PrincipalPage.Fecha_Año),
                Click.on(PrincipalPage.Fecha_Mes),
                Click.on(PrincipalPage.Fecha_Dia),
                Click.on(PrincipalPage.Button_simular),
                Click.on(PrincipalPage.indicado_datos)
        );



    }

}
