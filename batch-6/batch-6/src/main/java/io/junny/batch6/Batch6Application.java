package io.junny.batch6;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class Batch6Application {

  public static void main(String[] args) {
    SpringApplication.run(Batch6Application.class, args);
  }

}
