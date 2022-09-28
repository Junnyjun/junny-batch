package git.junny.batch4.job;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JobRunner implements ApplicationRunner {
  private final JobLauncher jobLauncher;
  private final Job job;
  @Override
  public void run(ApplicationArguments args) throws Exception {
    JobParameters params = new JobParametersBuilder().addString("now", LocalDateTime.now().toString()).toJobParameters();
    jobLauncher.run(job, params);
  }
}
