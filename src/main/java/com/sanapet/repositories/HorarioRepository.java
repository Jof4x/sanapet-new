package com.sanapet.repositories;

import com.sanapet.model.Horario;
import com.sanapet.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    List<Horario> getByIdVeterinario(Veterinario veterinario);
}
