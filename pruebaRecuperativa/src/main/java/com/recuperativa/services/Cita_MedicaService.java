package com.recuperativa.services;

import com.recuperativa.models.Cita_Medica;
import com.recuperativa.repositories.Cita_MedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class Cita_MedicaService {
    @Autowired
    Cita_MedicaRepository cita_medicaRepository;

    public void guardarCita(@Valid Cita_Medica cita_medica) {
        cita_medicaRepository.save(cita_medica);
    }

    public List<Cita_Medica> findAll() {
        return cita_medicaRepository.findAll();
    }
}
