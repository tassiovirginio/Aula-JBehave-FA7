package fa7.storys.steps;

import java.io.IOException;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Jogo;

public class RegrasDoJogoSteps {
	private Jogo jogo;
	private String contraSenha;
	
	/*@BeforeStory
	public void nomearJogador(@Named("nomeJogador") String nomeJogador) throws IOException{
		
		jogo.setNomeJogador(nomeJogador);
		
	}
	
	@AfterScenario
	public void questionarContinuacaoDeJogo(@Named("senha") String senha) throws IOException{
		
		if(senha.equals("0000")){
			System.out.println("Ate a proxima!");
		}
		
	}*/
	
	@Given("um Jogo que a senha é <senhaCorreta>")
	public void ObterLigador(@Named("senhaCorreta") String senhaCorreta) {
		jogo = new Jogo();
		jogo.setSenha(senhaCorreta);
	}
	
	@When("eu informo a senha <senhaCorreta>")
	public void LigadorSauda(@Named("senhaCorreta") String senhaCorreta){
		contraSenha = jogo.ValidarSenha(senhaCorreta);
	}
	
	@Then("o jogo me exibe um texto <contraSenha>")
	public void verificaASaudacao(@Named("contraSenha") String contraSenha) {
		Assert.assertEquals(contraSenha, this.contraSenha);
	}
}
