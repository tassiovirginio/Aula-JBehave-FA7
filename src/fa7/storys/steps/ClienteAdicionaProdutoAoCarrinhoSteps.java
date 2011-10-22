package fa7.storys.steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Cliente;

public class ClienteAdicionaProdutoAoCarrinhoSteps {
	
	private Cliente clienteObj;
	
	@Given("que $nomeCliente esta logado")
	@Alias("que <nomeCliente> esta logado")
	public void estaLogado(@Named("nomeCliente")String nomeCliente) {
		clienteObj = new Cliente();
		clienteObj.setName(nomeCliente);
		Assert.assertTrue(clienteObj.logar());
	}
	
	@Given("que $nomeCliente tem um carrinho")
	@Alias("que <nomeCliente> tem um carrinho")
	public void temUmCarrinho(@Named("nomeCliente")String cliente){
		Assert.assertNotNull(clienteObj.getCarrinho());
	}
	
	@When("um $produto eh adicionado ao carrinho")
	@Alias("um <produto> eh adicionado ao carrinho")
	public void adicionarBilheteAocarrinho(@Named("produto")String produto){
		clienteObj.getCarrinho().add(produto);
	}
	
	@Then("o $produto deve estar no carrinho")
	@Alias("o <produto> deve estar no carrinho")
	public void verificarProdutoNoCarrinho(@Named("produto")String produto) {
		Assert.assertTrue(clienteObj.getCarrinho().contains(produto));
	}

}
