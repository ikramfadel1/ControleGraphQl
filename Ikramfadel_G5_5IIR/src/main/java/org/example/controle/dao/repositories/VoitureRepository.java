package org.example.controle.dao.repositories;

import org.example.controle.dao.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VoitureRepository extends JpaRepository<Voiture, Long> {

    public List<Voiture> findByModel(String model);


}