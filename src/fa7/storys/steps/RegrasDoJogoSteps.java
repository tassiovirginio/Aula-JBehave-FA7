package fa7.storys.steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Cliente;
import fa7.domain.Jogo;

public class RegrasDoJogoSteps {
	private Jogo jogo;
	private String contraSenha;
	
	
	@BeforeStories
	public void setup() {
		jogo = new Jogo();
		jogo.setContador(0);
	}
	
	
	@Given("um Jogo que a senha e <senhaCorreta> e o nome do jogador e <nomeJogador>" )
	public void IniciarJogo(@Named("senhaCorreta") String senhaCorreta, @Named("nomeJogador") String nomeJogador) {
		jogo.setSenha(senhaCorreta);
		jogo.setNomeJogador(nomeJogador);
	}
	
	@When("eu informo a senha <senhaInformada>")
	public void LigadorSauda(@Named("senhaInformada") String senhaInformada){
		contraSenha = jogo.ValidarSenha(senhaInformada);
	}
	
	@Then("o jogo me exibe um texto <contraSenha> e pergunta se deseja jogar novamente")
	public void verificaASaudacao(@Named("contraSenha") String contraSenha) {
		Assert.assertEquals(contraSenha, this.contraSenha);
	}
	
//	@Then("o jogo me exibe um texto <contraSenha>")
//	public void ResultadoJogo(@Named("contraSenha") String contraSenha, @Named("nomeJogador") String nomeJogador) {
//	Assert.assertEquals(contraSenha, this.contraSenha);
//	Assert.assertEquals(nomeJogador,"Luana");
//	}
}
