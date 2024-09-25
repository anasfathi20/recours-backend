package com.example.recours.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="D_DEMANDE_AID")
public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID ;

    // private long BENEFICIARY_ID;
    @ManyToOne
    private Chef BENEFICIARY_ID;

    // private long DEMAND_TYPE_ID;
    @ManyToOne
    private AidType DEMAND_TYPE_ID;

    // private long LAST_STATE;
    @ManyToOne
    private SituationType LAST_STATE;

    private LocalDateTime CREATED_AT;
}