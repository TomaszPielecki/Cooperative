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

public class Regulacje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegulacji;
    private String tytul;
    private String opis;
    private Date dataWprowadzenia;
    private Date dataOstatniejModyfikacji;
    private String tekst;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Regulacje{");
        sb.append("idRegulacji=").append(idRegulacji);
        sb.append(", tytul='").append(tytul).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", dataWprowadzenia=").append(dataWprowadzenia);
        sb.append(", dataOstatniejModyfikacji=").append(dataOstatniejModyfikacji);
        sb.append(", tekst='").append(tekst).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
