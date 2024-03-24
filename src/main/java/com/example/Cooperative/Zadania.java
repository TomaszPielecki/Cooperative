package com.example.Cooperative;
import java.security.Timestamp;
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

public class Zadania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZadania;
    private int idZgloszenia;
    private Integer idPracownika;
    private Timestamp dataPrzypisania;
    private String opis;
    private String status;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zadania{");
        sb.append("idZadania=").append(idZadania);
        sb.append(", idZgloszenia=").append(idZgloszenia);
        sb.append(", idPracownika=").append(idPracownika);
        sb.append(", dataPrzypisania=").append(dataPrzypisania);
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
