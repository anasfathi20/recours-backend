package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recours.Entity.AidType;


@Repository
public interface AidTypeRepo extends JpaRepository<AidType, Long>{
}