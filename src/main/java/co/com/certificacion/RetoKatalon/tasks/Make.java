package co.com.certificacion.RetoKatalon.tasks;

import co.com.certificacion.RetoKatalon.model.ConstructorVar;
import co.com.certificacion.RetoKatalon.userinterface.ReservarCitaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;



public class Make implements Task
{

    private List<ConstructorVar> constructorVars;


    public Make (List<ConstructorVar> constructorVars)
    {
        this.constructorVars = constructorVars;
    }


    public static Make Appointment(List<ConstructorVar> constructorVars)
    {
        return Tasks.instrumented(Make.class, constructorVars);
    }



    @Override
    public <T extends Actor> void performAs(T actor)
    {
        for (ConstructorVar constructorVar : constructorVars) {
        actor.attemptsTo
                (
                        Click.on(ReservarCitaUI.CLICKMAKEAPPOINTMENT),
                        Click.on(ReservarCitaUI.ENTERUSERNAME),
                        Enter.theValue(constructorVar.getUsername()).into(ReservarCitaUI.ENTERUSERNAME),
                        Click.on(ReservarCitaUI.ENTERPASSWORD),
                        Enter.theValue(constructorVar.getPassword()).into(ReservarCitaUI.ENTERPASSWORD),
                        Click.on(ReservarCitaUI.BOTONLOGIN),
                        Enter.theValue(constructorVar.getDate()).into(ReservarCitaUI.INGRESARFECHA),
                        Enter.theValue(constructorVar.getComment()).into(ReservarCitaUI.INGRESARCOMENTARIO),
                        Click.on(ReservarCitaUI.CLICKBOTONBOOKAPPOINMET)

                );


        }

    }

}
