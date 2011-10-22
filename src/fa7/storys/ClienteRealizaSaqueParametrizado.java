package fa7.storys;

import fa7.storys.steps.SaqueDeClienteParametrizadoSteps;

public class ClienteRealizaSaqueParametrizado extends JUnitStoryFA7 {
	
	public ClienteRealizaSaqueParametrizado() {
		object = this;
		objectSteps = new SaqueDeClienteParametrizadoSteps();
	}
}