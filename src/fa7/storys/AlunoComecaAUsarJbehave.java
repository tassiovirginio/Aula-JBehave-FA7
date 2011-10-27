package fa7.storys;

import fa7.storys.steps.AlunoComecaAUsarJBehaveSteps;

public class AlunoComecaAUsarJbehave extends JUnitStoryFA7 {
	
	public AlunoComecaAUsarJbehave() {
		object = this;
		objectSteps = new AlunoComecaAUsarJBehaveSteps();
	}
	
}
