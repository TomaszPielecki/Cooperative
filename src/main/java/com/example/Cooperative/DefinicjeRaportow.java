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
public class DefinicjeRaportow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDefinicji;
    private String nazwa;
    private String opis;
    private String zapytanieSql;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DefinicjeRaportow{");
        sb.append("idDefinicji=").append(idDefinicji);
        sb.append(", nazwa='").append(nazwa).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", zapytanieSql='").append(zapytanieSql).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
