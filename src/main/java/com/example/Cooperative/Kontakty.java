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
public class Kontakty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKontaktu;
    private String imie;
    private String nazwisko;
    private String telefon;
    private String email;
    private String typKontaktu;
}

