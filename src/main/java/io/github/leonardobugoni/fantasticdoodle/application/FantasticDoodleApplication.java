package io.github.leonardobugoni.fantasticdoodle.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "${application.baseBackage}")
@SpringBootApplication(scanBasePackages = "${application.baseBackage}")
public class FantasticDoodleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasticDoodleApplication.class, args);
	}

}
