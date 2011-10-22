package fa7.storys.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Cliente;

public class ClienteAdicionaProdutoAoCarrinhoSteps {
	
	private Cliente clienteObj;
	
	@Given("que $nomeCliente esta logado")
	public void estaLogado(String nomeCliente) {
		clienteObj = new Cliente();
		clienteObj.setName(nomeCliente);
		Assert.assertTrue(clienteObj.logar());
	}
	
	@Given("que $cliente tem um carrinho")
	public void temUmCarrinho(String cliente){
		Assert.assertNotNull(clienteObj.getCarrinho());
	}
	
	@When("um $produto eh adicionado ao carrinho")
	public void adicionarBilheteAocarrinho(String produto){
		clienteObj.getCarrinho().add(produto);
	}
	
	@Then("o $produto deve estar no carrinho")
	public void verificarProdutoNoCarrinho(String produto) {
		Assert.assertTrue(clienteObj.getCarrinho().contains(produto));
	}

}
