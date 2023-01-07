package com.pavelkostal.shdatabase.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "hero")
@Getter
@Setter
@NoArgsConstructor
public class HeroName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hero_name")
    private String heroName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "heroName")
    @JsonBackReference
    private Set<HeroInformation> heroInformation;

    public HeroName(String heroName) {
        this.heroName = heroName;
    }
}
