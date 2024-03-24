package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Czynsz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCzynszu;
    private String idMieszkania;
    private Date data;
    private BigDecimal kwota;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Czynsz{");
        sb.append("idCzynszu=").append(idCzynszu);
        sb.append(", idMieszkania='").append(idMieszkania).append('\'');
        sb.append(", data=").append(data);
        sb.append(", kwota=").append(kwota);
        sb.append('}');
        return sb.toString();
    }
}
