package com.wissal.enseignants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.wissal.enseignants.entities.Enseignant;

@SpringBootApplication
public class EnseignantsBackendApplication {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EnseignantsBackendApplication.class, args);
	}
	
	
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Enseignant.class);
	}

}
