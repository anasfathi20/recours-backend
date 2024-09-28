package com.example.recours.Controller;


import com.example.recours.Entity.Customer;
import com.example.recours.Repository.CustomerRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final CustomerRepo customerRepo;

    public AuthController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @PostMapping("login")
    public String login(@RequestBody LoginDTO user){
        Optional<Customer> cs = customerRepo.findById(user.IDCS());
        if(cs.isPresent() && cs.get().getMDP().equals(user.Password()))
        {
            return Base64.getEncoder().encodeToString((user.IDCS()+':'+user.Password()).getBytes());
        }
        return "";
    }

}
