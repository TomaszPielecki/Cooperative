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
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idBlock;
    private String miasto;
    private String ulica;
    private Cooperative cooperative;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Block{");
        sb.append("idBlock='").append(idBlock).append('\'');
        sb.append(", miasto='").append(miasto).append('\'');
        sb.append(", ulica='").append(ulica).append('\'');
        sb.append(", cooperative=").append(cooperative);
        sb.append('}');
        return sb.toString();
    }
}