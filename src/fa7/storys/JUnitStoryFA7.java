package fa7.storys;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class JUnitStoryFA7 extends JUnitStory {
	
	protected Object object,objectSteps;
	
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.usePendingStepStrategy(new FailingUponPendingStep())
				.useStoryLoader(new LoadFromClasspath(object.getClass()))
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT));
	}


	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(),objectSteps).createCandidateSteps();
	}
}
