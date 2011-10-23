package fa7.storys;

import java.util.Locale;

import fa7.storys.steps.AlunoComecaAUsarJBehaveSteps;
import fa7.storys.steps.SaqueDeClienteParametrizadoSteps;

public class ClienteRealizaSaqueParametrizado extends JUnitStoryFA7 {
	
	public ClienteRealizaSaqueParametrizado() {
		object = this;
		objectSteps = new SaqueDeClienteParametrizadoSteps();
		locale = new Locale("en");
	}
}