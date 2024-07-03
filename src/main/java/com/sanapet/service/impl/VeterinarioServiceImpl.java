package com.sanapet.service.impl;

import com.sanapet.model.Veterinario;
import com.sanapet.repositories.VeterinarioRepository;
import com.sanapet.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService{
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Override
    public Veterinario registrarVeterinario(Veterinario veterinario)
    {
        return veterinarioRepository.save(veterinario);
    }
    @Override
    public Veterinario modificarVeterinario(Veterinario veterinario) {return veterinarioRepository.save(veterinario); }
    @Override
    public List<Veterinario> listarVeterinario() {
        return veterinarioRepository.findAll();
    }
    @Override
    public Veterinario obtenerVeterinarioPorId (Integer idVeterinario) {
        return veterinarioRepository.findById(idVeterinario).orElse(new Veterinario());
    }

}
