package com.pavelkostal.shdatabase.dao;

import com.pavelkostal.shdatabase.entity.HeroInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "heroInformation", path="hero-information")
public interface HeroInformationInterface extends JpaRepository <HeroInformation, Long> {
}

