package git.junny.batch2;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class Batch2Application {

  public static void main(String[] args) {
    SpringApplication.run(Batch2Application.class, args);
  }


}
