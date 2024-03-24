package com.example.Cooperative;

import java.util.Date;
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

public class Dokumenty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDokumentu;
    private String nazwa;
    private String opis;
    private Date data;
    private byte[] plik;
}
