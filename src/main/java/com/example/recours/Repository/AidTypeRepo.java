package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.AidType;

public interface AidTypeRepo extends JpaRepository<AidType, Long>{
}