package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class DefinicjeRaportow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDefinicji;
    private String nazwa;
    private String opis;
    private String zapytanieSql;
}
