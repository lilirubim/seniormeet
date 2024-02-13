package com.seniormeet.Repository;

import com.seniormeet.EntidadesModels.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
}