package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.SituationType;

public interface SituationTypeRepo extends JpaRepository<SituationType, Long>{
}