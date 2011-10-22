package fa7.storys.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class ClienteAdicionaProdutoAoCarrinhoCompostoSteps {
	
	@Given("$nomeCliente comprou previamente um $produto")
	@Alias("<nomeCliente> comprou previamente um <produto>")
	@Composite(steps={ 
			"Given que <nomeCliente> esta logado",
			"Given que <nomeCliente> tem um carrinho",
			"When um <produto> eh adicionado ao carrinho"})
	public void clienteCompraPreviamenteUmBilhete(@Named("nomeCliente") String nomeCliente, @Named("produto") String produto) {
	}

}
