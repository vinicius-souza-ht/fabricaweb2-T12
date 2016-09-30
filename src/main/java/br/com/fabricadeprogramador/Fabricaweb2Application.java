package br.com.fabricadeprogramador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Fabricaweb2Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Fabricaweb2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Fabricaweb2Application.class, args);
	}
}
