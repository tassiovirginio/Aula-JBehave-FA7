package fa7.storys;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import fa7.storys.steps.AlunoComecaAUsarJBehaveSteps;

public class AlunoComecaAUsarJbehave extends JUnitStory {
	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromClasspath(this.getClass()))
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT));
	}

	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(),
				new AlunoComecaAUsarJBehaveSteps()).createCandidateSteps();
	}
}
