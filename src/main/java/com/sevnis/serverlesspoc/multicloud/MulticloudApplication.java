package com.sevnis.serverlesspoc.multicloud;

import java.util.function.Function;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.function.context.FunctionalSpringApplication;

@SpringBootConfiguration
public class MulticloudApplication implements Function<String, String> {

  public static void main(String[] args) {
    FunctionalSpringApplication.run(MulticloudApplication.class, args);
  }

  @Override
  public String apply(String value) {
    return value.toUpperCase();
  }

}
