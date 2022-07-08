package com.recuperativa.models;

import javax.persistence.*;

@Entity
@Table(name="citas_medicas")
public class Cita_Medica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hora;
    private String area_medica;

    public Cita_Medica() {
    }

    public Cita_Medica(Long id, String hora, String area_medica) {
        this.id = id;
        this.hora = hora;
        this.area_medica = area_medica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getArea_medica() {
        return area_medica;
    }

    public void setArea_medica(String area_medica) {
        this.area_medica = area_medica;
    }
}
