package com.pavelkostal.shdatabase.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "information")
@Data
public class HeroInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private HeroName heroName;

    @Column(name = "film_name")
    private String filmName;

    @Column(name = "actor_name")
    private String actorName;

    @Column(name = "csfd_url")
    private String csfdUrl;

    @Column(name = "csfd_rating")
    private String csfdRating;


}
