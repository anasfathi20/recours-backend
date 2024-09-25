package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.Demande;

public interface DemandeRepo extends JpaRepository<Demande, Long>{
}