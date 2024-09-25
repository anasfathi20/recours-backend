package com.example.recours.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name="P_TYPE_AID")
public class AidType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long CODE ;

    private String LABEL_AR;

    private String LABEL_FR;
}