package co.com.proyectobase.screenplay.stepdefinitions;


import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class TraductorGoogleStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor rafa = Actor.named("rafa");
	
	@Before()
	public void configuracionInicial() {
		rafa.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Que rafa quiere usar el traductor de google$")
	public void queRafaQuiereUsarElTraductorDeGoogle() throws Exception {
	    rafa.wasAbleTo(Abrir.LaPaginaGoogle());
	}


	@When("^el traduce la palabra (.*) del ingles al espanol$")
	public void elTraduceLaPalabraTableDelInglesAlEspanol(String palabra) throws Exception {
		
	    rafa.attemptsTo(Traducir.DelEspañolAlIngles(palabra));
	}

	@Then("^el deberia ver la palabra (.*) en la pantalla$")
	public void elDeberiaVerLaPalabraMesaEnLaPantalla(String palabraEsperada) throws Exception {
	    rafa.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
	}

}
