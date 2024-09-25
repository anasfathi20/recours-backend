package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.Chef;

public interface ChefRepo extends JpaRepository<Chef, Long>{
}