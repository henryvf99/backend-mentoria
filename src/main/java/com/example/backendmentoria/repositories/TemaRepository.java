package com.example.backendmentoria.repositories;

import com.example.backendmentoria.models.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemaRepository extends JpaRepository<Tema, Long> {

    List<Tema> findByIduser(Integer iduser);

}
