package com.example.recours.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="D_CHEF_MENAGE_AID")
public class Chef {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID ;

    @OneToOne
    private Customer IDCS;
}