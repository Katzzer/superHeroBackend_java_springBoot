package com.pavelkostal.shdatabase.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hero")
@Getter
@Setter
public class HeroName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hero_name")
    private String heroName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "heroName")
    private Set<HeroInformation> heroInformation;


}
