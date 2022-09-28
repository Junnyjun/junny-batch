package git.junny.batch4;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class Batch4Application {

  public static void main(String[] args) {
    SpringApplication.run(Batch4Application.class, args);
  }

}
