package com.sanapet.service;

import com.sanapet.model.Veterinario;

import java.util.List;

public interface VeterinarioService {

    Veterinario registrarVeterinario(Veterinario veterinario);
    Veterinario modificarVeterinario (Veterinario veterinario);
    List<Veterinario> listarVeterinario();
    Veterinario obtenerVeterinarioPorId (Integer idVeterinario);
}
