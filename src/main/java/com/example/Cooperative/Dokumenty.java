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

public class Dokumenty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDokumentu;
    private String nazwa;
    private String opis;
    private Date data;
    private byte[] plik;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dokumenty{");
        sb.append("idDokumentu=").append(idDokumentu);
        sb.append(", nazwa='").append(nazwa).append('\'');
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", data=").append(data);
        sb.append(", plik=");
        if (plik == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < plik.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(plik[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }
}
