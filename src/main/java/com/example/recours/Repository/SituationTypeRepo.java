package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recours.Entity.SituationType;


@Repository
public interface SituationTypeRepo extends JpaRepository<SituationType, Long>{
}