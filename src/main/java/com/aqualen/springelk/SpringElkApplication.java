package com.aqualen.springelk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
//TODO:Add tracing info with micrometer
public class SpringElkApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringElkApplication.class, args);
    log.info("Started the application!");
  }

}
