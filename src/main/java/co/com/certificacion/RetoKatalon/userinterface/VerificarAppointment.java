package co.com.certificacion.RetoKatalon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificarAppointment
{
    public static final Target VERIFICARMENSAJE = Target.the("Extraer el mensaje a verificar").located(By.xpath("(//h2[contains(text (), 'Appointment Confirmation')])"));

}
