package com.example.recours.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name="Customer")
public class Customer {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String IDCS;

    private String MDP;

}