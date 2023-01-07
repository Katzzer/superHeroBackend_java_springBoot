package com.pavelkostal.shdatabase.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "information")
@Getter
@Setter
@NoArgsConstructor
public class HeroInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hero_name_id", nullable = false)
    @JsonManagedReference
    private HeroName heroName;

    @Column(name = "film_name")
    private String filmName;

    @Column(name = "actor_name")
    private String actorName;

    @Column(name = "csfd_url")
    private String csfdUrl;

    @Column(name = "csfd_rating")
    private int csfdRating;

    public HeroInformation(HeroName heroName, String filmName, String actorName, String csfdUrl, int csfdRating) {
        this.heroName = heroName;
        this.filmName = filmName;
        this.actorName = actorName;
        this.csfdUrl = csfdUrl;
        this.csfdRating = csfdRating;
    }
}
