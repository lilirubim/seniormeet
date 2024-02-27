package com.seniormeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SeniormeetApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SeniormeetApplication.class, args);
/*
		InteractionRepository interactionRepo = context.getBean(InteractionRepository.class);
		Interaction interaction1 = new Interaction(null, true, LocalDateTime.now(), false, LocalDateTime.now(), false, LocalDateTime.now(), "enhorabuena", LocalDateTime.now(), null, null, List.of());
		Interaction interaction2 = new Interaction(null, true, LocalDateTime.now(), true, LocalDateTime.now(), false, LocalDateTime.now(), "guapo", LocalDateTime.now(), null, null, List.of());
		Interaction interaction3 = new Interaction(null, true, LocalDateTime.now(), true, LocalDateTime.now(), true, LocalDateTime.now(), "felicidades", LocalDateTime.now(), null, null, List.of());

		interactionRepo.saveAll(List.of(interaction1, interaction2, interaction3));

		GroupRepository groupRepo = context.getBean(GroupRepository.class);
		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", null, "1", List.of());
		Group group2 = new Group(null, "Cultura", "Cine, teatro, espectáculos, museos", "sin alcohol", null, "2", List.of());

		groupRepo.saveAll(List.of(group1,group2));




		HobbyRepository hobbyRepo = context.getBean(HobbyRepository.class);

		Hobby hobby1 = new Hobby(null, "Balar Merengue", "divertida clase de Merengue ");
		Hobby hobby2 = new Hobby(null, "Paseo por el Retiro","lunes por la mañana a las 10 ");
		Hobby hobby3 = new Hobby(null, "Salida al Teatro", "dia 29 de febrero a las 19 h ");
		hobbyRepo.saveAll(List.of(hobby1, hobby2, hobby3));

 */
	}

}
