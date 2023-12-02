package com.imob.imobapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ImobapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImobapiApplication.class, args);
	}

}
