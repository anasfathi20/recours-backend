package com.example.recours.Controller;
import java.util.List;
import java.util.Optional;

import com.example.recours.Entity.Demande;
import com.example.recours.Repository.*;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.security.core.context.SecurityContextHolder;

import com.example.recours.Entity.Customer;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/demande")
public class DemandeController {

    public final AidTypeRepo aidRepo;
    public final ChefRepo chefRepo;
    public final CustomerRepo customerRepo;
    public final DemandeRepo demandeRepo;
    public final SituationTypeRepo situationTypeRepo;

    public DemandeController(AidTypeRepo aidRepo, ChefRepo chefRepo, DemandeRepo demandeRepo, CustomerRepo customerRepo, SituationTypeRepo situationTypeRepo) {
        this.aidRepo = aidRepo;
        this.chefRepo = chefRepo;
        this.demandeRepo = demandeRepo;
        this.customerRepo = customerRepo;
        this.situationTypeRepo = situationTypeRepo;
    }

    @GetMapping(value="get")
    public Optional<List<Demande>> getDemandes()
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Optional<Customer> customer = customerRepo.findById(auth.getName());
//        if(customer.isPresent())
//        {
            System.out.println(auth.getName());
            return demandeRepo.findByIDCS(auth.getName());
//        }
    }

}