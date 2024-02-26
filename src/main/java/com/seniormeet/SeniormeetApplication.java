package com.seniormeet;

import com.seniormeet.model.Hobby;
import com.seniormeet.repository.HobbyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;



@SpringBootApplication
public class SeniormeetApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SeniormeetApplication.class, args);
		HobbyRepository repo = context.getBean(HobbyRepository.class);

		// CRUD: CREATE y UPDATE con el método save()
		Hobby bailar = new Hobby(null, "Bailar", "Bailar ritmos latinos");
		Hobby pasear = new Hobby(null, "Pasear", "Dar una vuelta por la ciudad");
		Hobby tapear = new Hobby(null, "Tapear", "Tapeamos los viernes");
		Hobby animales = new Hobby(null, "animales", "Me gustan los animales");


		repo.saveAll(List.of(bailar, pasear, tapear, animales));


	}

}

