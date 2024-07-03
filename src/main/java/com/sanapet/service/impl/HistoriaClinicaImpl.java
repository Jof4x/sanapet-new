package com.sanapet.service.impl;

import com.sanapet.model.HistoriaClinica;
import com.sanapet.repositories.HistoriaClinicaRepository;
import com.sanapet.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaImpl implements HistoriaClinicaService {
    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Override
    public HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica){return historiaClinicaRepository.save(historiaClinica); }
    @Override
    public List<HistoriaClinica> listarHistoriaClinica(){return historiaClinicaRepository.findAll(); }
    @Override
    public HistoriaClinica obtenerHistoriaClinicaPorId(Integer idhistoriaClinica){
        return historiaClinicaRepository.findById(idhistoriaClinica).orElse(new HistoriaClinica());
    }
    @Override
    public HistoriaClinica modificarHistoriaClinica(HistoriaClinica historiaClinica) {
        return historiaClinicaRepository.save(historiaClinica);
    }
    @Override
    public void eliminarHistoriaClinica(Integer idhistoriaClinica) {historiaClinicaRepository.deleteById(idhistoriaClinica);}


}
