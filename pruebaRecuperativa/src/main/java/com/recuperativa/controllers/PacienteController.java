package com.recuperativa.controllers;

import com.recuperativa.models.Paciente;
import com.recuperativa.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    PacienteService pacienteService;

    @RequestMapping("") //ANOTACION PARA CAPTURAR RUTAS
    public String inicio(@ModelAttribute("paciente") Paciente paciente) {
        return "index.jsp";

    }

    @PostMapping("/registrar")
    public String registrarPaciente(@Valid @ModelAttribute("paciente") Paciente paciente,
                              BindingResult resultado,
                              Model model) {
        if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "index.jsp";
        } else {
            pacienteService.guardarPaciente(paciente);

            List<Paciente> listaPacientes = pacienteService.findAll();

            model.addAttribute("pacientesRegistrados", listaPacientes);
            return "pacientes.jsp";
        }
    }

    @RequestMapping("/mostrar")
    public String mostrar(Model model) {
        List<Paciente> listaPacientes = pacienteService.findAll();
        model.addAttribute("pacientesRegistrados", listaPacientes);
        return "pacientes.jsp";

    }
}
