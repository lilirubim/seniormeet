package com.seniormeet;

import com.seniormeet.model.Group;
import com.seniormeet.model.Sexo;
import com.seniormeet.model.User;
import com.seniormeet.model.UserRole;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.util.List;

@SpringBootApplication
public class SeniormeetApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SeniormeetApplication.class, args);


		GroupRepository groupRepo = context.getBean(GroupRepository.class);
		Group group1 = new Group(null, "Naturaleza", "Amantes de la Naturaleza", "Ganas de aventura", "naturaleza.jpeg", null);
		groupRepo.saveAll(List.of(group1));

		PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user1 = new User(
				null,
				"user1",
				"user1",
				"user1@gmail.com",
				passwordEncoder.encode("12345678"),
				"674536745",
				"28010",
				"Madrid",
				Sexo.FEMENINO,
				null,
				"avatar.png", true,
				UserRole.USER, List.of(group1), null);
		User user2 = new User(
				null,
				"admin",
				"admin",
				"admin@gmail.com",
				passwordEncoder.encode("12345678"),
				"777777777",
				"28001",
				"Madrid",
				Sexo.FEMENINO,
				null,
				"avatar.png", true,
				UserRole.ADMIN, null, null);
		userRepository.saveAll(List.of(user1, user2));


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
