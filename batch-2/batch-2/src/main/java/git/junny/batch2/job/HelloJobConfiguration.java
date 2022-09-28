package git.junny.batch2.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloJobConfiguration {
  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  public HelloJobConfiguration(JobBuilderFactory jobBuilderFactory,
      StepBuilderFactory stepBuilderFactory) {
    this.jobBuilderFactory = jobBuilderFactory;
    this.stepBuilderFactory = stepBuilderFactory;
  }

  @Bean
  public Job helloJob(){
    return jobBuilderFactory.get("helloJob")
        .start(helloStep())
        .build();
  }

  private Step helloStep() {
    return stepBuilderFactory.get("helloStep")
        .tasklet((stepContribution, chunkContext) -> {
          System.out.println("stepContribution = " + stepContribution);
          return RepeatStatus.FINISHED;
        })
        .build();
  }
}
