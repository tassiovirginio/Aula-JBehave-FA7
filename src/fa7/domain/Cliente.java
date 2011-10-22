package fa7.domain;

import java.util.ArrayList;

public class Cliente {
	
	private Double saldoAtual;
	private boolean especial;
	private String name;
	private ArrayList<String> carrinho;
	
	public ArrayList<String> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<String> carrinho) {
		this.carrinho = carrinho;
	}

	public Cliente() {
		name = "";
		carrinho = new ArrayList<String>();
	}
	
	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean logar(){
		return true;
	}
	
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
