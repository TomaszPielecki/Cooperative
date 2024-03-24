package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Platnosci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlatnosci;
    private int idLokatora;
    private Date data;
    private BigDecimal kwota;

    @Override//stringbuffer jest bezpieczny brak wielowatkowosci
    public String toString() {
        final StringBuffer sb = new StringBuffer("Platnosci{");
        sb.append("idPlatnosci=").append(idPlatnosci);
        sb.append(", idLokatora=").append(idLokatora);
        sb.append(", data=").append(data);
        sb.append(", kwota=").append(kwota);
        sb.append('}');
        return sb.toString();
    }
}
