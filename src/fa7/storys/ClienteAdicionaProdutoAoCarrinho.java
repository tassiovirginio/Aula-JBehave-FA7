package fa7.storys;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import fa7.storys.steps.ClienteAdicionaProdutoAoCarrinhoCompostoSteps;
import fa7.storys.steps.ClienteAdicionaProdutoAoCarrinhoSteps;

public class ClienteAdicionaProdutoAoCarrinho extends JUnitStoryFA7 {
	
	public ClienteAdicionaProdutoAoCarrinho() {
		object = this;
	}
	
	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(),
				new ClienteAdicionaProdutoAoCarrinhoSteps(),
				new ClienteAdicionaProdutoAoCarrinhoCompostoSteps()
		).createCandidateSteps();
	}
}
