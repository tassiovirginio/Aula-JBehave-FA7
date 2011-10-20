package fa7.storys.steps;

import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import fa7.domain.Cliente;


public class SaqueDeClienteSteps {
	
	private Cliente cliente;
	private boolean saqueEfetuado = false;
	
	@BeforeScenario
	public void setup() {
		cliente = new Cliente();
	}
	
	@Given("um cliente especial com saldo atual de $f reais")
	public void popularCliente(Double saldoAtual) {
		cliente.setSaldoAtual(saldoAtual);
		cliente.clienteEspecial();
	}
	
	@When("for solicitado um saque no valor $valorDoSaque reais")
	public void sacar(Double valorDoSaque){
		saqueEfetuado = cliente.sacar(valorDoSaque);
	}
	
	@Then("deve efetuar um saque e atualizar o saldo da conta para $novoSaldo reais")
	public void verificaOSaldo(Double novoSaldo) {
		Assert.assertTrue(saqueEfetuado);
		Assert.assertEquals(novoSaldo, cliente.getSaldoAtual());
	}
}
