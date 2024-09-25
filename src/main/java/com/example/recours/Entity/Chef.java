package com.example.recours.Entity;

import jakarta.persistence.*;
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
@Table(name="D_CHEF_MENAGE_AID")
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID ;

    @OneToOne
    private Customer IDCS;
}