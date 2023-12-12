package co.com.angelica.caballero.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utest_registro.feature",
        tags = "@Utest",
        glue = "co.com.angelica.caballero.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerTags{}





