package fa7.storys.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Ligador;

public class AlunoComecaAUsarJBehaveSteps {
	
	private Ligador ligador;
	private String saudacao;
	
	@Given("um ligador")
	public void ObterLigador() {
		ligador = new Ligador();
	}
	
	@When("ele saudar o mundo")
	public void LigadorSauda(){
		saudacao = ligador.Saudar();
	}
	
	@Then("eu devo receber um $saudacao")
	public void verificaASaudacao(String saudacao) {
		Assert.assertEquals(saudacao, this.saudacao);
	}

}
