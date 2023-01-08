package com.pavelkostal.shdatabase.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record SuperHeroModelFromPublicApi(
        String response,
        @JsonAlias("results-for") String resultsFor,
        Results[] results
) {

    public record Results(
            String id,
            String name,
            Powerstats powerstats,
            Biography biography,
            Appearance appearance,
            Work work,
            Connections connections,
            Image image
    ) {
    }

    public record Powerstats(
            String intelligence,
            String strength,
            String speed,
            String durability,
            String power,
            String combat
    ) {
    }

    public record Biography(
            @JsonAlias("full-name") String fullName,
            @JsonAlias("alter-egos") String alterEgos,
            String[] aliases,
            @JsonAlias("place-of-birth") String placeOfBirth,
            @JsonAlias("first-appearance") String firstAppearance,
            String alignment
    ) {
    }

    public record Appearance(
            String gender,
            String race,
            String[] height,
            String[] weight,
            @JsonAlias("eye-color") String eyeColor
    ) {
    }

    public record Work(
            String occupation,
            String base
    ) {
    }

    public record Connections(
            @JsonAlias("group-affiliation") String groupAffiliation,
            String relatives
    ) {
    }

    public record Image(
            String url
    ) {
    }

}
