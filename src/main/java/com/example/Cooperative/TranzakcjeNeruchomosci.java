package com.example.Cooperative;

import java.math.BigDecimal;
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

public class TranzakcjeNeruchomosci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransakcji;
    private String typTransakcji;
    private String idMieszkania;
    private Date dataTransakcji;
    private BigDecimal cena;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TranzakcjeNeruchomosci{");
        sb.append("idTransakcji=").append(idTransakcji);
        sb.append(", typTransakcji='").append(typTransakcji).append('\'');
        sb.append(", idMieszkania='").append(idMieszkania).append('\'');
        sb.append(", dataTransakcji=").append(dataTransakcji);
        sb.append(", cena=").append(cena);
        sb.append('}');
        return sb.toString();
    }
}
