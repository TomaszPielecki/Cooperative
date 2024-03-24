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

public class Rezerwacje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRezerwacji;
    private int idLokatora;
    private int idUdogodnienia;
    private Timestamp dataPoczatkowa;
    private Timestamp dataKoncowa;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezerwacje{");
        sb.append("idRezerwacji=").append(idRezerwacji);
        sb.append(", idLokatora=").append(idLokatora);
        sb.append(", idUdogodnienia=").append(idUdogodnienia);
        sb.append(", dataPoczatkowa=").append(dataPoczatkowa);
        sb.append(", dataKoncowa=").append(dataKoncowa);
        sb.append('}');
        return sb.toString();
    }
}
