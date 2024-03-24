package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Korespondencja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKorespondencji;
    private int idLokatora;
    private Date data;
    private String rodzaj;
    private String opis;
}
