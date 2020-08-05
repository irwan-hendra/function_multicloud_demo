package com.sevnis.serverlesspoc.multicloud;

import java.util.function.Function;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MulticloudApplication {

  public static void main(String[] args) {
    FunctionalSpringApplication.run(MulticloudApplication.class, args);
  }

  @Bean
  public Function<String, String> uppercase() {
    return value -> value.toUpperCase();
  }

}

//@SpringBootConfiguration
//public class MulticloudApplication implements Function<String, String> {
//
//	public static void main(String[] args) {
//		FunctionalSpringApplication.run(MulticloudApplication.class, args);
//	}
//
//	@Override
//	public String apply(String value) {
//		return value.toUpperCase();
//	}
//
//}
