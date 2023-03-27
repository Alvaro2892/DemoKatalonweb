package co.com.certificacion.RetoKatalon.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoKatalon.feature",
        glue = {"co.com.certificacion.RetoKatalon.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RetoKatalon
{
}
