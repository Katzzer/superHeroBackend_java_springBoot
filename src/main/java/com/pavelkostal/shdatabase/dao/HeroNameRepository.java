package com.pavelkostal.shdatabase.dao;

import com.pavelkostal.shdatabase.entity.HeroName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "heroName", path="hero-name-list")
public interface HeroNameRepository extends JpaRepository  <HeroName, Long> {
}
