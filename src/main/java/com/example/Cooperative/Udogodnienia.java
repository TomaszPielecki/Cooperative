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

public class Udogodnienia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUdogodnienia;
    private String nazwa;
    private String opis;
    private boolean dostepnosc;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Udogodnienia{");
        sb.append("idUdogodnienia=").append(idUdogodnienia);
        sb.append(", nazwa='").append(nazwa).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", dostepnosc=").append(dostepnosc);
        sb.append('}');
        return sb.toString();
    }
}
