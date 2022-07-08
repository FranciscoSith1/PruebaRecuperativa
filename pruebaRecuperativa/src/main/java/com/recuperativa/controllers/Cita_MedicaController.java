package com.recuperativa.controllers;

import com.recuperativa.models.Cita_Medica;
import com.recuperativa.services.Cita_MedicaService;
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
@RequestMapping("/citas")
public class Cita_MedicaController {
    @Autowired
    Cita_MedicaService cita_medicaService;

    @RequestMapping("") //ANOTACION PARA CAPTURAR RUTAS
    public String inicioCitas(@ModelAttribute("cita_medica") Cita_Medica cita_medica) {
        return "indexCitas.jsp";

    }

    @PostMapping("/registrar")
    public String registrarCita(@Valid @ModelAttribute("cita_medica") Cita_Medica cita_medica,
                                    BindingResult resultado,
                                    Model model) {
        if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "indexCitas.jsp";
        } else {
            cita_medicaService.guardarCita(cita_medica);

            List<Cita_Medica> listaCitas = cita_medicaService.findAll();

            model.addAttribute("citasRegistradas", listaCitas);
            return "pacientes.jsp";
        }
    }

    @RequestMapping("/mostrar")
    public String mostrar(Model model) {
        List<Cita_Medica> listaCitas = cita_medicaService.findAll();
        model.addAttribute("citasRegistradas", listaCitas);
        return "pacientes.jsp";

    }
}
