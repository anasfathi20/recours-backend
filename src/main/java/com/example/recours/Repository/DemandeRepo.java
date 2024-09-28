package com.example.recours.Repository;

import com.example.recours.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.recours.Entity.Demande;

import java.util.List;
import java.util.Optional;

@Repository
public interface DemandeRepo extends JpaRepository<Demande, Long>{
     @Query("select d from Demande d where d.BENEFICIARY_ID.IDCS.IDCS=?1")
     Optional<List<Demande>> findByIDCS(String identifiant);
}