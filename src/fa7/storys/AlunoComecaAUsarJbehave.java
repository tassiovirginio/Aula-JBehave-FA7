package fa7.storys;

import java.util.Locale;

import fa7.storys.steps.AlunoComecaAUsarJBehaveSteps;
import fa7.storys.steps.SaqueDeClienteSteps;

public class AlunoComecaAUsarJbehave extends JUnitStoryFA7 {
	
	public AlunoComecaAUsarJbehave() {
		object = this;
		objectSteps = new AlunoComecaAUsarJBehaveSteps();
		locale = new Locale("en");
	}
	
}
