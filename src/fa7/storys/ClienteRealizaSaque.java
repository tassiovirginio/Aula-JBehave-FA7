package fa7.storys;

import fa7.storys.steps.SaqueDeClienteSteps;

public class ClienteRealizaSaque extends JUnitStoryFA7 {
	
	public ClienteRealizaSaque() {
		object = this;
		objectSteps = new SaqueDeClienteSteps();
	}

}
