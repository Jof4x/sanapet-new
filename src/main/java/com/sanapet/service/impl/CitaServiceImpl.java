package com.sanapet.service.impl;

import com.sanapet.model.Cita;
import com.sanapet.repositories.CitaRepository;
import com.sanapet.service.CitaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository citaRepository;

    CitaServiceImpl(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
    }

    public List<Cita> listAll(){
        return this.citaRepository.findAll();
    }

    @Override
    public Cita createCita(Cita cita) {
        return this.citaRepository.save(cita);
    }

    @Override
    public List<Cita> listCitas() {
        return this.citaRepository.findAll();
    }

    @Override
    public Cita getCitaById(Integer id) {return this.citaRepository.getById(id);}

    @Override
    public Cita updateCita(Cita cita) {
        return this.citaRepository.save(cita);
    }

    @Override
    public void deleteCita(Integer id) {
        this.citaRepository.deleteById(id);
    }
}