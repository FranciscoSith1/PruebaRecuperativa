package com.recuperativa.services;

import com.recuperativa.models.Paciente;
import com.recuperativa.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class PacienteService {
    @Autowired
    PacienteRepository pacienteRepository;

    public void guardarPaciente(@Valid Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
}
