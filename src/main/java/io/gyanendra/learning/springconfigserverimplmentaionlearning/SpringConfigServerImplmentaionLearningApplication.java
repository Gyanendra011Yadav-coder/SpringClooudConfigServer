package io.gyanendra.learning.springconfigserverimplmentaionlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerImplmentaionLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerImplmentaionLearningApplication.class, args);
	}

}
