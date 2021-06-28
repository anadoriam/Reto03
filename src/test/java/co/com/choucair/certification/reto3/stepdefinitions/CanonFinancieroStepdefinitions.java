package co.com.choucair.certification.reto3.stepdefinitions;

import co.com.choucair.certification.reto3.tasks.OpenUp;
import co.com.choucair.certification.reto3.tasks.Principal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CanonFinancieroStepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Ana quiere ingrsar al simulador Canon Financiero$")
    public void anaQuiereIngrsarAlSimuladorCanonFinanciero() throws Exception {
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(),(Principal.onPage()));
    }

    @When("^Ana ingrese los campos solicitiados$")
    public void anaIngreseLosCamposSolicitiados() throws Exception {

    }

    @Then("^puede visualizar la simulacion de Canon Financiero$")
    public void puedeVisualizarLaSimulacionDeCanonFinanciero() throws Exception {

    }
}
