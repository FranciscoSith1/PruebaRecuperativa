package com.recuperativa.repositories;

import com.recuperativa.models.Cita_Medica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cita_MedicaRepository extends JpaRepository<Cita_Medica, Long> {
}
