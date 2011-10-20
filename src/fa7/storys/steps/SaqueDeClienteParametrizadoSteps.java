package fa7.storys.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Cliente;


public class SaqueDeClienteParametrizadoSteps {
	
	private Cliente cliente;
	
	private boolean saqueEfetuado = false;
	
	@Given("um cliente especial com saldo atual de <saldoAtual> reais")
	public void popularCliente(@Named("saldoAtual") Double saldoAtual) {
		cliente = new Cliente();
		cliente.setSaldoAtual(saldoAtual);
		cliente.clienteEspecial();
	}
	
	@When("for solicitado um saque no valor <valorDoSaque> reais")
	public void sacar(@Named("valorDoSaque") Double valorDoSaque){
		saqueEfetuado = cliente.sacar(valorDoSaque);
	}
	
	@Then("deve efetuar um saque e atualizar o saldo da conta para <novoSaldo> reais")
	public void verificaOSaldo(@Named("novoSaldo") Double novoSaldo) {
		Assert.assertTrue(saqueEfetuado);
		Assert.assertEquals(novoSaldo, cliente.getSaldoAtual());
	}
}
