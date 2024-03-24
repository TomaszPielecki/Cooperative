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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kontakty{");
        sb.append("idKontaktu=").append(idKontaktu);
        sb.append(", imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", typKontaktu='").append(typKontaktu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

