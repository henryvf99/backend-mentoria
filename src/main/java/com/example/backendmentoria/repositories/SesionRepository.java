package com.example.backendmentoria.repositories;

import com.example.backendmentoria.models.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SesionRepository extends JpaRepository<Sesion, Long> {

    List<Sesion> findByIduser(Integer iduser);

}
