package co.com.certificacion.RetoKatalon.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservarCitaUI
{
    public static final Target CLICKMAKEAPPOINTMENT = Target.the("click en el botón Make Appointments").located(By.id("btn-make-appointment"));
    public static final Target ENTERUSERNAME = Target.the("Clic en el input y luego ingreso el username ").located(By.id("txt-username"));
    public static final Target ENTERPASSWORD = Target.the("Clic en el input y luego ingreso la password ").located(By.id("txt-password"));
    public static final Target BOTONLOGIN = Target.the("Clic en el boton login ").located(By.id("btn-login"));
    public static final Target INGRESARFECHA = Target.the("Ingresar fecha").located(By.id("txt_visit_date"));
    public static final Target INGRESARCOMENTARIO = Target.the("Ingresar comentario").located(By.id("txt_comment"));
    public static final Target CLICKBOTONBOOKAPPOINMET = Target.the("Ingresar comentario").located(By.id("btn-book-appointment"));






}
