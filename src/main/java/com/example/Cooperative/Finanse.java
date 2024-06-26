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
public class Finanse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFinansu;
    private String typTransakcji;
    private Date data;
    private String opis;
    private BigDecimal kwota;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Finanse{");
        sb.append("idFinansu=").append(idFinansu);
        sb.append(", typTransakcji='").append(typTransakcji).append('\'');
        sb.append(", data=").append(data);
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", kwota=").append(kwota);
        sb.append('}');
        return sb.toString();
    }
}
