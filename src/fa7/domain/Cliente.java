package fa7.domain;

public class Cliente {
	
	private Double saldoAtual;
	private boolean especial;
	
	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public void clienteEspecial() {
		especial = true;
	}

	public boolean sacar(Double valorDoSaque) {
		if (especial) {
			saldoAtual -= valorDoSaque;
			return true;
		}
		return false;
	}

}
