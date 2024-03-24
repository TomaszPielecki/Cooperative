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

public class Zgloszenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZgloszenia;
    private int idLokatora;
    private Timestamp dataZgloszenia;
    private String opis;
    private String status;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zgloszenia{");
        sb.append("idZgloszenia=").append(idZgloszenia);
        sb.append(", idLokatora=").append(idLokatora);
        sb.append(", dataZgloszenia=").append(dataZgloszenia);
        sb.append(", opis='").append(opis).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

