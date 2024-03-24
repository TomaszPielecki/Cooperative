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

public class TypyPrac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String typ;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TypyPrac{");
        sb.append("typ='").append(typ).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
