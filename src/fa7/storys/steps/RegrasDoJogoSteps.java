package fa7.storys.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Jogo;

public class RegrasDoJogoSteps {
	private Jogo jogo;
	private String contraSenha;
	
	@Given("um Jogo que a senha é $senha")
	public void ObterLigador(String senha) {
		jogo = new Jogo();
		jogo.setSenha(senha);
	}
	
	@When("eu informo a senha $senha")
	public void LigadorSauda(String senha){
		contraSenha = jogo.ValidarSenha(senha);
	}
	
	@Then("o jogo me exibe um texto $contrasenha")
	public void verificaASaudacao(String contraSenha) {
		Assert.assertEquals(contraSenha, this.contraSenha);
	}
}
