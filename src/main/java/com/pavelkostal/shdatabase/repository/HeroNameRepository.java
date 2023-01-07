package com.pavelkostal.shdatabase.repository;

import com.pavelkostal.shdatabase.entity.HeroName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"http://localhost:4200", "http://localhost:8081"})
@RepositoryRestResource(collectionResourceRel = "heroName", path="hero-name-list")
//@Repository
public interface HeroNameRepository extends JpaRepository  <HeroName, Long> {
}

