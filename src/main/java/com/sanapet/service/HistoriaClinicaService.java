package com.sanapet.service;

import com.sanapet.model.HistoriaClinica;

import java.util.List;

public interface HistoriaClinicaService {
    HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica modificarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica obtenerHistoriaClinicaPorId(Integer idhistoriaClinica);
    List<HistoriaClinica> listarHistoriaClinica();
    void eliminarHistoriaClinica(Integer idhistoriaClinica);
}

