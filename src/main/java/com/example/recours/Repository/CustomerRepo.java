package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recours.Entity.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
    @Query("select c from Customer c where c.Identifiant=?1")
    Optional<Customer> findByIdentifiant(String identifiant);
}