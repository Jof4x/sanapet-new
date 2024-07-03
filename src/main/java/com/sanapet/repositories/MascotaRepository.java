package com.sanapet.repositories;

import com.sanapet.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

}
