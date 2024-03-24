package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Korespondencja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idKorespondencji;
    private int idLokatora;
    private Date data;
    private String rodzaj;
    private String opis;

    public String toString() {
        final StringBuffer sb = new StringBuffer("Korespondencja{");
        sb.append("idKorespondencji= '").append(idKorespondencji).append('\'');
        sb.append(", idLokatora=").append(idLokatora).append('\'');
        sb.append(", data=").append(data).append('\'');
        sb.append(", rodzaj=").append(rodzaj).append('\'');
        sb.append(", opis=").append(opis).append('\'');
        sb.append("}");
        return sb.toString();
    }
}
