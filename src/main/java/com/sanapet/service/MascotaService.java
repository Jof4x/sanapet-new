package com.sanapet.service;

import com.sanapet.model.Mascota;

import java.util.List;

public interface MascotaService {
    Mascota registrarMascota(Mascota mascota);
    Mascota modificarMascota (Mascota mascota);
    List<Mascota> listarMascotas();
    Mascota obtenerMascotaPorId(Integer idMascota);
    void eliminarMascota(Integer idMascota);
}