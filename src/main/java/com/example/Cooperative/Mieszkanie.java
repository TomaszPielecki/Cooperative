package com.example.Cooperative;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Mieszkanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nrMieszkania;
    private double powierzchnia;
    private int iloscPokoi;
    private int typMieszkania;
    private String stanTechniczny;
    private BigDecimal czynsz;
    private Block block;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mieszkanie{");
        sb.append("nrMieszkania='").append(nrMieszkania).append('\'');
        sb.append(", powierzchnia=").append(powierzchnia);
        sb.append(", iloscPokoi=").append(iloscPokoi);
        sb.append(", typMieszkania=").append(typMieszkania);
        sb.append(", stanTechniczny='").append(stanTechniczny).append('\'');
        sb.append(", czynsz=").append(czynsz);
        sb.append(", block=").append(block);
        sb.append('}');
        return sb.toString();
    }
}
