package com.seniormeet;

import com.seniormeet.controller.GroupController;
import com.seniormeet.model.Group;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DeferredImportSelector;

import java.util.List;

@SpringBootApplication
public class SeniormeetApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SeniormeetApplication.class, args);

		GroupRepository groupRepo = context.getBean(GroupRepository.class);

		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", null, "1", List.of());
		Group group2 = new Group(null, "Cultura", "Cine, teatro, espectáculos, museos", "sin alcohol", null, "2", List.of());

		groupRepo.saveAll(List.of(group1,group2));
	}

}
