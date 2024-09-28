package com.example.recours.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.recours.Entity.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, String>{
    // @Query("select c from Customer c where c.Identifiant=?1")
    // Optional<Customer> findByIdentifiant(String identifiant);
}