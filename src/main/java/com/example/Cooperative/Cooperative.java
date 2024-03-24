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
public class Cooperative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwa;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cooperative{");
        sb.append("id=").append(id);
        sb.append(", nazwa='").append(nazwa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}



