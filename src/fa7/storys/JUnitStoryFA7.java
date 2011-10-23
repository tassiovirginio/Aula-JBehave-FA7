package fa7.storys;

import java.util.List;
import java.util.Locale;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.ConsoleOutput;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class JUnitStoryFA7 extends JUnitStory {
	
	protected Object object,objectSteps;
	protected Locale locale;
	
	public Configuration configuration() {
		
		Keywords keywords = new LocalizedKeywords(locale);
		
		return new MostUsefulConfiguration()
		.useKeywords(keywords)
		.useStoryParser(new RegexStoryParser(keywords))
		.useDefaultStoryReporter(new ConsoleOutput(keywords))
				.usePendingStepStrategy(new FailingUponPendingStep())
				.useStoryLoader(new LoadFromClasspath(object.getClass()))
				.useStoryReporterBuilder(
						new StoryReporterBuilder().withDefaultFormats()
								.withFormats(Format.CONSOLE, Format.TXT)
								.withKeywords(keywords)
								);
	}


	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(),objectSteps).createCandidateSteps();
	}
}
