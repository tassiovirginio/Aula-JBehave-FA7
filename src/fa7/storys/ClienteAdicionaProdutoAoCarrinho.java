package fa7.storys;

import fa7.storys.steps.ClienteAdicionaProdutoAoCarrinhoSteps;

public class ClienteAdicionaProdutoAoCarrinho extends JUnitStoryFA7 {
	public ClienteAdicionaProdutoAoCarrinho() {
		object = this;
		objectSteps = new ClienteAdicionaProdutoAoCarrinhoSteps();
	}
}
