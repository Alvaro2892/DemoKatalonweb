package co.com.certificacion.RetoKatalon.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.certificacion.RetoKatalon.userinterface.VerificarAppointment.VERIFICARMENSAJE;

public class Verificar implements Question<Boolean>
{
    private final String word;

    public Verificar(String word)
    {
        this.word = word;
    }

    public static Verificar mensajeSitioWeb(String questionv)
    {
        return new Verificar(questionv);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        //String texto = Text.of(VERIFICARMENSAJE).viewedBy(actor).asString();
        WebElementFacade webElementFacade = VERIFICARMENSAJE.resolveFor(actor);
        String texto = webElementFacade.getText();
        return word.equals(texto);
    }
}