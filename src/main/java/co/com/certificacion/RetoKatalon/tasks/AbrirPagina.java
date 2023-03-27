package co.com.certificacion.RetoKatalon.tasks;

import co.com.certificacion.RetoKatalon.userinterface.AbrirPaginaKatalon;
import co.com.certificacion.RetoKatalon.userinterface.ReservarCitaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class
AbrirPagina implements Task
{
    private AbrirPaginaKatalon abrirPaginaKatalon;



    public static AbrirPagina katalonCitas()
    {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)

    {
        actor.attemptsTo
                (
                        Open.browserOn(abrirPaginaKatalon)


                );
    }
}
