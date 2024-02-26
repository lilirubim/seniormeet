package com.seniormeet;

import com.seniormeet.model.Group;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.InteractionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class SeniormeetApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SeniormeetApplication.class, args);

		InteractionRepository interactionRepo = context.getBean(InteractionRepository.class);
		Interaction interaction1 = new Interaction(null, true, LocalDateTime.now(), false, LocalDateTime.now(), false, LocalDateTime.now(), "enhorabuena", LocalDateTime.now(), null, null, List.of());
		Interaction interaction2 = new Interaction(null, true, LocalDateTime.now(), true, LocalDateTime.now(), false, LocalDateTime.now(), "guapo", LocalDateTime.now(), null, null, List.of());
		Interaction interaction3 = new Interaction(null, true, LocalDateTime.now(), true, LocalDateTime.now(), true, LocalDateTime.now(), "felicidades", LocalDateTime.now(), null, null, List.of());

		interactionRepo.saveAll(List.of(interaction1, interaction2, interaction3));

		GroupRepository groupRepo = context.getBean(GroupRepository.class);
		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", null, "1", List.of());
		Group group2 = new Group(null, "Cultura", "Cine, teatro, espectáculos, museos", "sin alcohol", null, "2", List.of());

		groupRepo.saveAll(List.of(group1,group2));


	}

}



