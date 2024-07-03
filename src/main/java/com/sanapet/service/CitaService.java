package com.sanapet.service;

import com.sanapet.model.Cita;

import java.util.List;
public interface CitaService {

    Cita createCita(Cita cita);
    List<Cita> listCitas();
    Cita getCitaById(Integer id);
    Cita updateCita(Cita cita);
    void deleteCita(Integer id);
}
