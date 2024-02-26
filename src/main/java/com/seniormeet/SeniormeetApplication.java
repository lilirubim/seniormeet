package com.seniormeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		GroupRepository groupRepo = context.getBean(GroupRepository.class);
		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", null, "1", List.of());
		Group group2 = new Group(null, "Cultura", "Cine, teatro, espectáculos, museos", "sin alcohol", null, "2", List.of());
		groupRepo.saveAll(List.of(group1,group2));
	}

}
