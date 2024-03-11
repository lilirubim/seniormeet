package com.seniormeet;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.HobbyRepository;
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



//		GroupRepository groupRepo = context.getBean(GroupRepository.class);
//		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", null, "1", List.of());
//		Group group2 = new Group(null, "Cultura", "Cine, teatro, espectáculos, museos", "sin alcohol", null, "2", List.of());
//
//		groupRepo.saveAll(List.of(group1,group2));
//
//
//
//
//		HobbyRepository hobbyRepo = context.getBean(HobbyRepository.class);
//
//		Hobby hobby1 = new Hobby(null, "Balar Merengue", "divertida clase de Merengue ");
//		Hobby hobby2 = new Hobby(null, "Paseo por el Retiro","lunes por la mañana a las 10 ");
//		Hobby hobby3 = new Hobby(null, "Salida al Teatro", "dia 29 de febrero a las 19 h ");
//		hobbyRepo.saveAll(List.of(hobby1, hobby2, hobby3));
	}

}
